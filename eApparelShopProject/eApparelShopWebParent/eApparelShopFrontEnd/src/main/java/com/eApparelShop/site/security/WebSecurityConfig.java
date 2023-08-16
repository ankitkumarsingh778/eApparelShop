package com.eApparelShop.site.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.eApparelShop.site.security.oauth.CustomerOAuth2UserService;
import com.eApparelShop.site.security.oauth.OAuth2LoginSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	http.authorizeRequests().requestMatchers("/images/**", "/js/**", "/webjars/**").permitAll();
	http.authorizeRequests().requestMatchers("/customer").authenticated().anyRequest().permitAll().and().formLogin()
		.loginPage("/login").usernameParameter("email").permitAll().and().logout().permitAll().and()
		.rememberMe().key("1234567890_aBcDeFgHiJkLmNoPqRstUVxXYz").tokenValiditySeconds(14 * 24 * 60 * 60);

	return http.build();
    }

    @Bean
	public UserDetailsService userDetailsService() {
		return new CustomerUserDetailsService();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());

		return authProvider;
	}	
    
}

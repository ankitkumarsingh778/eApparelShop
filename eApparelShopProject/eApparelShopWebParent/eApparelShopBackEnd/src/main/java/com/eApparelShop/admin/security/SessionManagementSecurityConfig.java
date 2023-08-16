package com.eApparelShop.admin.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class SessionManagementSecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
	return new eApparelShopUserDetailsService();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
    }

    public DaoAuthenticationProvider authenticationProvider() {
	DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	authProvider.setUserDetailsService(userDetailsService());
	authProvider.setPasswordEncoder(passwordEncoder());

	return authProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
	return authConfig.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	http.authorizeRequests().requestMatchers("/images/**", "/js/**", "/webjars/**").permitAll().requestMatchers("/users/**").hasAnyAuthority("Admin", "Editor","Salesperson","Assistant","Shipper")
	.requestMatchers("/categories/**", "/brands/**").hasAnyAuthority("Admin", "Editor","Salesperson","Assistant","Shipper")
	
	.requestMatchers("/products/new", "/products/delete/**").hasAnyAuthority("Admin", "Editor","Salesperson","Assistant","Shipper")
	
	.requestMatchers("/products/edit/**", "/products/save", "/products/check_unique")
		.hasAnyAuthority("Admin", "Editor","Salesperson","Assistant","Shipper")
		
	.requestMatchers("/products", "/products/", "/products/detail/**", "/products/page/**")
		.hasAnyAuthority("Admin", "Editor","Salesperson","Assistant","Shipper")
		
	.requestMatchers("/products/**").hasAnyAuthority("Admin", "Editor","Salesperson","Assistant","Shipper")
	.anyRequest()
		.authenticated().and().formLogin().loginPage("/login").usernameParameter("email").permitAll().and()
		.logout().permitAll().and().rememberMe().key("AbcDefgHijkl_12345");

	http.authenticationProvider(authenticationProvider());

	return http.build();
    }
}

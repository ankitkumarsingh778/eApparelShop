package com.eApparelShop.admin.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {
    

    @Test
    public void testEncodePassword() {

	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	String rawPassword = "admin123";
	String encodedPassword = passwordEncoder.encode(rawPassword);
	;
	/* rawPassword = "dks778"; */
	System.out.println(encodedPassword);

	boolean matches = passwordEncoder.matches(rawPassword, encodedPassword);
	assertThat(matches).isTrue();
    }

}

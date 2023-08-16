package com.eApparelShop.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({ "com.eApparelShop.common.entity", "com.eApparelShop.admin.user" })
public class EApparelShopBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(EApparelShopBackEndApplication.class, args);
	}

}

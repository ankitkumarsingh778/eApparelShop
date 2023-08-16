package com.eApparelShop.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({ "com.eApparelShop.common.entity"})
public class EApparelShopFrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(EApparelShopFrontEndApplication.class, args);
	}

}

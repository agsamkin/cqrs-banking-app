package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableConfigurationProperties
@EnableTransactionManagement
public class CqrsBankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CqrsBankingAppApplication.class, args);
	}

}

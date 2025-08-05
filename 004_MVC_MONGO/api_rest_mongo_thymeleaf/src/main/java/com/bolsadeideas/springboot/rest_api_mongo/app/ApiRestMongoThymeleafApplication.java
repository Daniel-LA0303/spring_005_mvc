package com.bolsadeideas.springboot.rest_api_mongo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ApiRestMongoThymeleafApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().load();
		System.setProperty("DB_URL", dotenv.get("DB_URL"));

		SpringApplication.run(ApiRestMongoThymeleafApplication.class, args);
	}

}

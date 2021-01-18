package com.api.marvel.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.api.marvel.feign.client.MarvelClient;

@SpringBootApplication
@EnableFeignClients
public class ApiMarvelFeignApplication implements CommandLineRunner {
	@Autowired
	MarvelClient client;

	public static void main(String[] args) {
		SpringApplication.run(ApiMarvelFeignApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("Teste");
	}

}

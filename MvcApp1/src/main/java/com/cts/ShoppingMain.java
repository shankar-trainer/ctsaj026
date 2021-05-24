package com.cts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingMain implements CommandLineRunner {
	
	public static void main(String[] args) {
	
		SpringApplication.run(ShoppingMain.class, args);	
	}

	public void run(String... args) throws Exception {
		System.out.println("run can contain additional code");
	}
	
}

package com.nocturne.nocturne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.nocturne.nocturne.model")
public class NocturneApplication {
	public static void main(String[] args) {
		SpringApplication.run(NocturneApplication.class, args);
	}

}

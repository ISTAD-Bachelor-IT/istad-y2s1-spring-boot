package dev.oudom.sbapp;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbA01E1Application implements CommandLineRunner {

	@Value("${server.port}")
	private Integer appPort;

	public static void main(String[] args) {
		SpringApplication.run(SbA01E1Application.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct App port: " + appPort);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunner App port: " + appPort);
	}
}

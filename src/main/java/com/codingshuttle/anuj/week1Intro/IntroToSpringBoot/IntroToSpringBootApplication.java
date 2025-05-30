package com.codingshuttle.anuj.week1Intro.IntroToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroToSpringBootApplication implements CommandLineRunner {
	@Autowiredconfiggloba user
	Apple obj ;
	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringBootApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
	}
}

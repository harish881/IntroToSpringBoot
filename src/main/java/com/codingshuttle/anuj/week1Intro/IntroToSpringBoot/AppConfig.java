package com.codingshuttle.anuj.week1Intro.IntroToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("singleton")
    Apple getApple(){
        return new Apple();
    }
}

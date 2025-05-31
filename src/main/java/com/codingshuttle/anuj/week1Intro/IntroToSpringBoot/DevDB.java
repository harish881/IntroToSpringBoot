package com.codingshuttle.anuj.week1Intro.IntroToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "dev")
public class DevDB implements DB{

    public String getData(){
        return "Dev Data";
    }
}

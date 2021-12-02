package com.mycloset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.stereotype.Component;

@EnableResourceServer
@EnableAuthorizationServer
@SpringBootApplication
@EntityScan(basePackages = {"com.mycloset"})
public class MyClosetOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyClosetOauthApplication.class, args);
    }

}

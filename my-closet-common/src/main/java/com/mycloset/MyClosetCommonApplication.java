package com.mycloset;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class})
@EntityScan(basePackages = {"com.mycloset"})
@Slf4j
public class MyClosetCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyClosetCommonApplication.class, args);
	}

}

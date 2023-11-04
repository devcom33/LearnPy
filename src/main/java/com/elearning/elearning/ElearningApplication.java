package com.elearning.elearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.elearning.elearning.config.RsakeysConfig;

@SpringBootApplication
@EnableConfigurationProperties(RsakeysConfig.class)
public class ElearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElearningApplication.class, args);
	}

}

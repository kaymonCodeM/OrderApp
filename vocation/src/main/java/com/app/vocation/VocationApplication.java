package com.app.vocation;

import com.app.vocation.Config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class VocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VocationApplication.class, args);
	}

}

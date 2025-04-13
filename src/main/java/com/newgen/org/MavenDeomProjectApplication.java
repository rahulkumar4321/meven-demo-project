package com.newgen.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.newgen.org.controller"})
public class MavenDeomProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDeomProjectApplication.class, args);
	}

}

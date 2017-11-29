package com.lm.fems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lm.fems.mapper")
public class FemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FemsApplication.class, args);
	}
}

package com.bcn.nn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.bcn.nn.main.repository")
@SpringBootApplication
public class BucheonNanumApplication {

	public static void main(String[] args) {
		SpringApplication.run(BucheonNanumApplication.class, args);
	}

}

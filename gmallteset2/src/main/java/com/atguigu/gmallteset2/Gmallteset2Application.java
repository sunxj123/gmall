package com.atguigu.gmallteset2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.atguigu.gmallteset2.mapper")
@SpringBootApplication
public class Gmallteset2Application {

	public static void main(String[] args) {
		SpringApplication.run(Gmallteset2Application.class, args);
	}

}

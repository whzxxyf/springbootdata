package com.zyx.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//因为还没有配置数据库，他自动注入的时候就会报错
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringbootdataTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdataTestApplication.class, args);
	}
}

package com.zyx.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//因为还没有配置数据库，他自动注入的时候就会报错
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
//也可以在主程序中增加mapper文件的扫描，就不需要在每个mapper文件中写@mapper了
//@MapperScan(value = "com.zyx.springboot.mybatis.mapper")
public class SpringbootdataTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdataTestApplication.class, args);
	}
}

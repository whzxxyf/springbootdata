package com.zyx.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import com.zyx.springboot.utils.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdataTestApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() throws Exception{
		System.out.println(dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
	}

	@Test
	public void genStr(){
		//String str = GenRandomAndChar.creatStr(10);
		String str = GenRandomAndChar.getRandomPassword(4);
		System.out.println(str);
	}

}

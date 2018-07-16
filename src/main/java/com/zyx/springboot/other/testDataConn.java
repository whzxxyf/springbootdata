package com.zyx.springboot.other;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;

public class testDataConn {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/springboot-data?useSSL=false";
        String driver = "com.mysql.jdbc.Driver";
        try{
            Class clazz = Class.forName(driver);
        }catch(Exception e){
            System.out.println("无法加载驱动");
        }

        try {
            Connection con = DriverManager.getConnection(url,"root","123456");
            if(!con.isClosed())
                System.out.println("success");
                System.out.println(con);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

package com.zyx.springboot.jpa.entity;

import javax.persistence.*;

//配置jpa映射关系
@Entity //告诉jpa这是一个实体类（是和数据表进行映射的类）
@Table(name = "tbl_user")  //表示和哪一张表进行对应,若果省略，那么默认表名是类名小写
public class User {


    @Id //表示这是逐渐
    @GeneratedValue(strategy = GenerationType.IDENTITY) //表示主键自增
    private Integer id;

    @Column(name = "last_name", length = 100) //这是和数据表对应的一个列
    private String lastName;

    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

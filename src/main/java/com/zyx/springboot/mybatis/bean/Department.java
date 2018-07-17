package com.zyx.springboot.mybatis.bean;

public class Department {

    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartName() {
        return departmentName;
    }

    public void setDepartName(String departmentName) {
        this.departmentName = departmentName;
    }
}

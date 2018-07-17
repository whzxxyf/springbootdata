package com.zyx.springboot.mybatis.mapper;


import com.zyx.springboot.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

//使用配置文件的形式

@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}

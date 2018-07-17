package com.zyx.springboot.mybatis.controller;


import com.zyx.springboot.mybatis.bean.Department;
import com.zyx.springboot.mybatis.bean.Employee;
import com.zyx.springboot.mybatis.mapper.DepartmentMapper;
import com.zyx.springboot.mybatis.mapper.EmployeeMapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeptController {


    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;


    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable Integer id){
        return employeeMapper.getEmpById(id);
    }

    @GetMapping("/emp")
    public Employee insertEmp(Employee employee){
        employeeMapper.insertEmp(employee);
        return employee;
    }

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);

        return department;
    }

}

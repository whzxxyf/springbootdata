package com.zyx.springboot.jpa.repository;

import com.zyx.springboot.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


//实现jpa的统一接口
//泛型中的第一个参数是需要操作的实体类，第二个参数为实体类（对应的数据库表）中主键的类型
public interface UserRepositroy extends JpaRepository<User,Integer> {


}

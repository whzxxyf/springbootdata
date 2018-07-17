package com.zyx.springboot.mybatis.mapper;


import com.zyx.springboot.mybatis.bean.Department;
import org.apache.ibatis.annotations.*;

//制定这是一个操作数据库的mapper，使用注解的形式
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id = #{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id = #{id}")
    public int updateDept(Department department);


}

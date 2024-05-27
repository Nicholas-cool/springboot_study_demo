package com.wzq.springboot_study_demo.mapper;

import com.wzq.springboot_study_demo.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper  // 表示本类是一个 MyBatis 的 Mapper
@Repository
public interface DepartmentMapper {

    // 获取所有部门信息
    List<Department> getDepartments();

    // 通过 id 获得部门
    Department getDepartment(Integer id);

}

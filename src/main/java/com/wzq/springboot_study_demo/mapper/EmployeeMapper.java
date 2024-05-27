package com.wzq.springboot_study_demo.mapper;

import com.wzq.springboot_study_demo.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {

    // 获取所有员工
    List<Employee> getEmployees();

    // 新增一个员工
    int save(Employee employee);

    // 修改员工信息
    int update(Employee employee);

    // 通过 id 获得员工
    Employee get(Integer id);

    // 通过 id 删除员工
    int delete(Integer id);

}

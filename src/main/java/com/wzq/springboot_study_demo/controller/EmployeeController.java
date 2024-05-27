package com.wzq.springboot_study_demo.controller;

import com.wzq.springboot_study_demo.pojo.Department;
import com.wzq.springboot_study_demo.pojo.Employee;
import com.wzq.springboot_study_demo.mapper.EmployeeMapper;
import com.wzq.springboot_study_demo.mapper.DepartmentMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    // 查询所有员工，返回列表页面
    @RequestMapping("/emps")
    public String list(Model model){
        List<Employee> allEmployees = employeeMapper.getEmployees();
        model.addAttribute("emps", allEmployees);
        return "emp/list";
    }

    // to 员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        // 查出所有部门的信息，用于下拉框选项
        List<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    // 员工添加功能
    // 接收前端传递的参数，自动封装成为对象（要求前端传递的参数名，和属性名一致）
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println(employee);
        // 添加的操作（调用底层业务方法保存员工信息）
        employeeMapper.save(employee);
        return "redirect:/emps";  // 回到员工列表页面，可以使用 redirect 或 forward
    }

    // to 员工修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id, Model model){
        // 查出原来的数据
        Employee employee = employeeMapper.get(id);
        model.addAttribute("emp", employee);

        // 查出所有部门的信息，用于下拉框选项
        List<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("departments", departments);

        return "emp/update";
    }

    // 修改员工信息
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        employeeMapper.update(employee);
        return "redirect:/emps";  // 回到员工列表页面
    }

    // 删除员工
    @GetMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        employeeMapper.delete(id);
        return "redirect:/emps";  // 回到员工列表页面
    }
}

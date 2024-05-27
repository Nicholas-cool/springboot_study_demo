package com.wzq.springboot_study_demo.pojo;

import java.util.Date;

// 员工表
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;  // 0：女；1：男

    private Integer department;
    private Date birth;

    private Department eDepartment;

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Integer gender,
                    Integer department, Department eDepartment) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.eDepartment = eDepartment;
        this.birth = new Date();
    }

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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Department geteDepartment() {
        return eDepartment;
    }

    public void seteDepartment(Department eDepartment) {
        this.eDepartment = eDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", department=" + department +
                ", birth=" + birth +
                ", eDepartment=" + eDepartment +
                '}';
    }
}

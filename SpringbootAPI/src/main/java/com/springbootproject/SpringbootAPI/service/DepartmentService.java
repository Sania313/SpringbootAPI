package com.springbootproject.SpringbootAPI.service;

import com.springbootproject.SpringbootAPI.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDeptId(Long departmentId);

   public void deleteDeptbyId(Long departmentId);

   public Department updateDept(long departmentId, Department department);
}

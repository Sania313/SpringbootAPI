package com.springbootproject.SpringbootAPI.controller;

import com.springbootproject.SpringbootAPI.entity.Department;
import com.springbootproject.SpringbootAPI.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping(value = "/departments")
    public Department saveDepartment(@RequestBody Department department){
      return departmentService.saveDepartment(department);
    }
@GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDeptId(@PathVariable("id") Long departmentId){
 return departmentService.fetchDeptId(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDeptbyId(@PathVariable("id") Long departmentId){
  departmentService.deleteDeptbyId(departmentId);
        return "Department deleted Successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDept(@PathVariable("id") long departmentId
    , @RequestBody Department department)
    {
return departmentService.updateDept(departmentId,department);
    }



}

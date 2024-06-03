package com.springbootproject.SpringbootAPI.service;

import com.springbootproject.SpringbootAPI.entity.Department;
import com.springbootproject.SpringbootAPI.repository.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DeptServiceImp implements DepartmentService{

    @Autowired
    private DeptRepo deptRepo;
    @Override
    public Department saveDepartment(Department department) {
        return deptRepo.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return deptRepo.findAll();
    }

    @Override
    public Department fetchDeptId(Long departmentId) {
        return deptRepo.findById(departmentId).get();
    }

    @Override
    public void deleteDeptbyId(Long departmentId) {
        deptRepo.deleteById(departmentId);
    }

    @Override
    public Department updateDept(long departmentId, Department department) {
        Department depDB = deptRepo.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName()) &&
        !"".equalsIgnoreCase(department.getDepartmentName())){
depDB.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())){
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            depDB.setDepartmentCode(department.getDepartmentCode());
        }
        return  deptRepo.save(depDB);
    }
}

package com.springbootproject.SpringbootAPI.repository;

import com.springbootproject.SpringbootAPI.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends JpaRepository<Department,Long> {
}

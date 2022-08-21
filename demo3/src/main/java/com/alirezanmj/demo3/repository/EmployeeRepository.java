package com.alirezanmj.demo3.repository;

import com.alirezanmj.demo3.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long > {

}

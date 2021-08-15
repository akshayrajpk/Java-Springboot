package com.akshay.demo.repository;

import com.akshay.demo.model.Employee;
import com.akshay.demo.service.fetchEmps.EmpData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(value = "SELECT e.emp_id as EmpId,e.email as Email, e.name as Name, e.designation as Designation FROM employee e",nativeQuery = true)
    List<EmpData> findAllEmps();

    boolean existsByEmail(String email);
}

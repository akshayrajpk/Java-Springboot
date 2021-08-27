package com.example.client.repository;

import com.example.client.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "SELECT * FROM Employee e WHERE e.id >= :salary",
            nativeQuery = true)
    List<Employee> filterEmployeeOnSalary(@Param("salary") float salary);

}

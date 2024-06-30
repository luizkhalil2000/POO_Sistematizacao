package com.mgs.traveller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mgs.traveller.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

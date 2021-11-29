package com.example.assignment.repo;

import com.example.assignment.data.Employee;
import com.example.assignment.data.Position;

import java.util.List;

public interface EmployeeRepo {

    int save(Employee employee);

    int update(Employee employee, Long id);

    Employee findById(Long id);

    int deleteById(Long id);

    List<Employee> getAll();

    List<Employee> findByTrainee(Boolean trainee);

    int deleteAll();
}

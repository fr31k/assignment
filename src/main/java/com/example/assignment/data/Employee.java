package com.example.assignment.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Embedded;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private int salary;
    private boolean trainee;
//    private Position position;
//    enum Gender {
//        MALE, FEMALE
//    }

    public Employee(String name, int salary, Boolean trainee) {
        this.name = name;
        this.salary = salary;
        this.trainee = trainee;
    }

}

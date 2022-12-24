package com.employee_wage;

public class EmpWagePgm {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");
        double employeeCheck = Math.floor((Math.random() * 10) % 3);

        if (employeeCheck == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

    }
}
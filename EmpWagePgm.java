package com.employee_wage;

public class EmpWagePgm {

    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int DAY_HOUR = 8;
        int dailyWage = 0;

        System.out.println("Welcome to Employee Wage Computation");
        double employeeCheck = Math.floor((Math.random() * 10) % 3);

        if (employeeCheck == 1) {
            System.out.println("Employee is Present");
            dailyWage = WAGE_PER_HOUR * DAY_HOUR;
            System.out.println("Daily Employee Wage : " + dailyWage);

        } else {
            System.out.println("Employee is Absent");
        }

    }
}
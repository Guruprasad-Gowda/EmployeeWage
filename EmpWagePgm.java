package com.employee_wage;

public class EmpWagePgm {

    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int DAY_HOUR = 8;
        int PART_HOUR = 4;
        int dailyWage = 0;

        System.out.println("Welcome to Employee Wage Computation");
        double employeeCheck = Math.floor((Math.random() * 10) % 3);

        if (employeeCheck == 1) {
            System.out.println("Employee is Present");
            dailyWage = WAGE_PER_HOUR * DAY_HOUR;
            System.out.println("Daily Employee Wage : " + dailyWage);
            System.out.println("Employee Worked for Full Time");
        } else if (employeeCheck == 2) {
            System.out.println("Employee is Present");
            dailyWage = WAGE_PER_HOUR * PART_HOUR;
            System.out.println("Daily Employee Wage : " + dailyWage);
            System.out.println("Employee Worked for Part Time");
        } else {
            System.out.println("Employee is Absent");
        }

    }
}

package com.employee_wage;

public class EmpWagePgm {

    public static void main(String[] args) {
        final int WAGE_PER_HOUR = 20;
        final int DAY_HOUR = 8;
        final int PART_HOUR = 4;
        final int WORKING_DAYS = 20;
        int totalWage = 0;
        int totalHour = 0;

        System.out.println("Welcome to Employee Wage Computation");
        for (int day = 1; day < 30; day++) {
            System.out.println();
            double employeeCheck = Math.floor((Math.random() * 10) % 3);

            int dailyWage = 0;
            int dailyHour = 0;
            System.out.println("Day : " + day);
            switch ((int) employeeCheck) {
                case 1:
                    System.out.println("Employee is Present");
                    System.out.println("Employee Worked for Full Time");
                    dailyWage = WAGE_PER_HOUR * DAY_HOUR;
                    dailyHour = DAY_HOUR;
                    break;

                case 2:
                    System.out.println("Employee is Present");
                    System.out.println("Employee Worked for Part Time");
                    dailyWage = WAGE_PER_HOUR * PART_HOUR;
                    dailyHour = PART_HOUR;
                    break;

                default:
                    System.out.println("Employee is Absent");
                    break;
            }

            System.out.println("Daily Employee Wage : " + dailyWage);
            totalWage += dailyWage;
            totalHour += dailyHour;

            if (day >= WORKING_DAYS) {
                break;
            }

        }

        System.out.println();
        System.out.println("Total Wage of Employee : " + totalWage);
    }

}

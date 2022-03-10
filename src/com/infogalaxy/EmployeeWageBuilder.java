package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    int total_Wage = 0;
    int total_hrs = 0;
    int working_days = 0;
    int sum_totalWage = 0;
    Random random = new Random();

    public void empWageCalculation() {
        while (working_days < Constance.WORKING_DAYS && total_hrs <= Constance.TOTAL_WORKING_HR) {
            working_days++;
            System.out.println("Day :" + working_days);
            int empAttendance = random.nextInt() % 2;         //Generate the random NO
            System.out.println(empAttendance);
            if (empAttendance == Constance.IS_ABSENT) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
                int empType = random.nextInt() % 2;
                if (empType < 0) {
                    empType = -empType;
                }
                switch (empType) {
                    case Constance.IS_FULL_TIME:
                        System.out.println("Full Time");
                        total_Wage = Constance.WAGE_PER_HR * Constance.FULL_TIME;
                        total_hrs = total_hrs + Constance.FULL_TIME;
                        break;
                    case Constance.IS_PART_TIME:
                        System.out.println("Part Time");
                        total_Wage = Constance.WAGE_PER_HR * Constance.PART_TIME;
                        total_hrs = total_hrs + Constance.PART_TIME;
                        break;
                }
            }
            sum_totalWage = total_Wage + sum_totalWage;
        }
    }
    public void displayEmpWage() {
        System.out.println("Total Wage =" + sum_totalWage);
        System.out.println("Total Hours =" + total_hrs);
    }
    public static void main(String[] args) {
        EmployeeWageBuilder employeeWageBuilder =new EmployeeWageBuilder();
        employeeWageBuilder.empWageCalculation();
        employeeWageBuilder.displayEmpWage();
    }
}

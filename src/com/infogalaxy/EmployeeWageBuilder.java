package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //UC-2 Calculate the Daily Wage
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int total_Wage = 0;
        //UC-1 Employee Attendance
        Random random = new Random();
        int empAttendance = random.nextInt() % 2;         //Generate the random NO
        System.out.println(empAttendance);
        if(empAttendance == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
            total_Wage = WAGE_PER_HR * FULL_DAY_HR;
        }
        System.out.println("Total Wage ="+total_Wage);

    }
}

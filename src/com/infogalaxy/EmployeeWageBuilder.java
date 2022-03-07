package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //UC-2 Calculate the Daily Wage
        final int WAGE_PER_HR = 20;
        final int FULL_TIME = 8;
        final int PART_TIME = 4;
        int total_Wage = 0;
        //UC-1 Employee Attendance
        Random random = new Random();
        int empAttendance = random.nextInt() % 2;         //Generate the random NO
        System.out.println(empAttendance);
        if(empAttendance == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
            //UC-3 Employee Part time or Full Time
            int empType = random.nextInt() % 2;
            if(empType == 0){
                System.out.println("Full Time");
                total_Wage = WAGE_PER_HR * FULL_TIME;
            } else {
                System.out.println("Part Time");
                 total_Wage = WAGE_PER_HR * PART_TIME;
            }
        }
        System.out.println("Total Wage ="+total_Wage);

    }
}

package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //UC-2 Calculate the Daily Wage
        final int WAGE_PER_HR = 20;
        final int FULL_TIME = 8;
        final int PART_TIME = 4;
        final int WORKING_DAYS = 20;
        final int IS_ABSENT = 0;
        final int IS_FULL_TIME = 0;
        final int IS_PART_TIME = 1;
        final int TOTAL_WORKING_HR = 100;
        int total_Wage = 0;
        int total_hrs = 0;
        int working_days = 0;
        //UC-1 Employee Attendance
        Random random = new Random();
        //UC-6 Calculate Wage for 20 Days or total Working Hours upto 100
        while(working_days <= WORKING_DAYS && total_hrs <= TOTAL_WORKING_HR) {
            working_days++;
            int empAttendance = random.nextInt() % 2;         //Generate the random NO
            System.out.println(empAttendance);
            if (empAttendance == IS_ABSENT) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
                //UC-4 Employee Part time or Full Time using SWITCH-CASE
                int empType = random.nextInt() % 2;
                if(empType < 0) {
                    empType = -empType;
                }
                switch (empType) {
                    case IS_FULL_TIME:
                        System.out.println("Full Time");
                        total_Wage = WAGE_PER_HR * FULL_TIME;
                        total_hrs = total_hrs + FULL_TIME;
                        break;
                    case IS_PART_TIME:
                        System.out.println("Part Time");
                        total_Wage = WAGE_PER_HR * PART_TIME;
                        total_hrs = total_hrs + PART_TIME;
                        break;
                }

            }
            System.out.println("Total Wage =" + total_Wage);
            System.out.println("Total Hours =" + total_hrs);
        }
    }
}

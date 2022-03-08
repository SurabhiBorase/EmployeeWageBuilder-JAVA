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
        //UC-5 Calculate Wage for 20 Days
        for(int i = 1; i < 20; i++) {
            int empAttendance = random.nextInt() % 2;         //Generate the random NO
            System.out.println(empAttendance);
            if (empAttendance == 0) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
                //UC-4 Employee Part time or Full Time using SWITCH-CASE
                int empType = random.nextInt() % 2;
                switch (empType) {
                    case 0:
                        System.out.println("Full Time");
                        total_Wage = WAGE_PER_HR * FULL_TIME;
                        break;
                    case 1:
                    case -1:
                        System.out.println("Part Time");
                        total_Wage = WAGE_PER_HR * PART_TIME;
                        break;
                }

            }
            System.out.println("Total Wage =" + total_Wage);
        }
    }
}

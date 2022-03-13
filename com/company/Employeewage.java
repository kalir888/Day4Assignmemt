package com.company;

public class Employeewage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int HALF_DAY_HOUR = 4;
    public static final int TOTAL_WORKING_DAYS = 20;
    public static final int TOTAL_WORKING_HOURS = 100;
    public static void main(String[] args) {
        int day = 1;
        int employeeWorkingHoursPerDay;
        int totalEmployeeWage;
        int totalEmployeeWorkingHours = 0;
        while ( day <= TOTAL_WORKING_DAYS & totalEmployeeWorkingHours <= TOTAL_WORKING_HOURS ){
            int attendance = (int) (Math.round(Math.random()*10)%3);
            switch (attendance){
                case IS_FULL_TIME:
                    employeeWorkingHoursPerDay = FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    employeeWorkingHoursPerDay = HALF_DAY_HOUR;
                    break;
                default:
                    employeeWorkingHoursPerDay = 0;
                    break;
            }
            totalEmployeeWorkingHours += employeeWorkingHoursPerDay;
            day++;
        }
        totalEmployeeWage = totalEmployeeWorkingHours * WAGE_PER_HOUR;
        if (day == 21) day = 20;
        System.out.println("total days that employee worked = " + day);
        System.out.println("total hours that employee worked = " + totalEmployeeWorkingHours);
        System.out.println("total employee wage for month = " + totalEmployeeWage);
    }
}

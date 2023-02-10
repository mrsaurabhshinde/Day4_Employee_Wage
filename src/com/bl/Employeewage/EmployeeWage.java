package com.bl.Employeewage;

public class EmployeeWage
{
    public static final int isPartTime = 2;
    public static final int isFullTime = 1;
    public static final int empRatePerHour = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage program");
        int empHrs = 0;
        int totalWage = 0;

        double empcheck= Math.floor(Math.random() *10) % 3;

        switch ((int)empcheck){

            case isFullTime:
                empHrs=8;
                break;

            case isPartTime:
                empHrs=4;
                break;

            default:
                empHrs=0;

        }

        totalWage = empHrs * empRatePerHour;

        System.out.println("Emp WAge: " + totalWage);
    }
}

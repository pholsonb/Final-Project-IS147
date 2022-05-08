package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String className;
        String classTime;
        String classLength;
        String startDate;
        String endDate;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your class Schedule");

        System.out.println("Class Name: ");
        className=sc.next();

        System.out.println("Class time: ");
        classTime=sc.next();

        System.out.println("Class time length");
        classLength=sc.next();

        System.out.println("Start date: ");
        startDate=sc.next();

        System.out.println("End date: ");
        endDate=sc.next();

        System.out.println("Class name: " + className);
        System.out.println("Class length: " + classLength);
        System.out.println("Class time: " + classTime);
        System.out.println("Class start: " + startDate);
        System.out.println("Class end: " + endDate);

        System.out.println(className);

        System.out.println("Press 1 to continue");

    }
}


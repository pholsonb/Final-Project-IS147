package com.company;

import java.util.Scanner;

public class input extends Main{

    public static void classes(){
        String className;
        String classStartTime;
        String classEndTime;

        String startDate;
        String endDate;
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your class Schedule");

        System.out.println("Class Name: ");
        className=sc.next();

        System.out.println("Class start time: ");
        classStartTime=sc.next();

        System.out.println("Class end time: ");
        classEndTime=sc.next();

        System.out.println("Start date: ");
        startDate=sc.next();

        System.out.println("End date: ");
        endDate=sc.next();



        System.out.println(className);




    }
}


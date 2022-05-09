package com.company;

import java.util.Scanner;

public class input {

    public static void classes(){

        int enter;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("welcome to the Schedule Builder");
        System.out.println("Type 1 to enter a class schedule");
        System.out.println("Type 2 to enter a job schedule");
        System.out.println("Type 3 to enter a chore Schedule");
        enter = Integer.parseInt(sc1.next());

        if(enter == 1) {

            Scanner sc = new Scanner(System.in);

            String className;
            String classStartTime;
            String classEndTime;
            String startDate;
            String endDate;

            System.out.println("Enter your class Schedule");

            System.out.println("Class Name: ");
            className = sc.next();

            System.out.println("Class start time: ");
            classStartTime = sc.next();

            System.out.println("Class end time: ");
            classEndTime = sc.next();

            System.out.println("Start date: ");
            startDate = sc.next();

            System.out.println("End date: ");
            endDate = sc.next();

            System.out.println(classStartTime + "-" + classEndTime + " " + className);

        }
    }
}


package com.company;

import java.util.Scanner;

public class addClass {

    static String className;
    static String classStartTime;
    static String classEndTime;
    static int startDateMonth;
    static int startDateDay;
    static int endDateMonth;
    static int endDateDay;
    static int weekday;


    public int getStartDateMonth(){
        return startDateMonth;
    }
    public void setStartDateMonth(int startDateMonth){
        this.startDateMonth=startDateMonth;
    }

    public int getEndDateMonth(){
        return endDateMonth;
    }
    public void setEndDateMonth(int endDateMonth){
        this.endDateMonth=endDateMonth;
    }

    public int getStartDateDay(){
        return startDateDay;
    }
    public void setStartDateDay(int startDateDay){
        this.startDateDay=startDateDay;
    }

    static Scanner sc1 = new Scanner(System.in);

    static input e = new input();
    static int enter = e.getEnter();

    static input fc = new input();
    static String fullClass = fc.getFullClass();

    static input sm = new input();
    static String startM = sm.getStartM();

    static input em = new input();
    static String endM = em.getEndM();

    public static void main() {
        if (e.getEnter() == 1) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your class Schedule");

                System.out.println("Class Name: ");
                className = sc.next();

                System.out.println("Class start time: ");
                classStartTime = sc.next();

                System.out.println("Class end time: ");
                classEndTime = sc.next();

                System.out.println("enter what days of the week this class occurs (1-7)");
                System.out.println("1 represents Sunday, 7 is Saturday. For example 34 is Tuesday and Wednesday, 26 is Monday and Friday");
                weekday = Integer.parseInt(sc.next());

                System.out.println("Enter number of start month (1-12): ");
                startDateMonth = Integer.parseInt(sc.next());

                System.out.println("Day of the month that it starts");
                startDateDay = Integer.parseInt(sc.next());

                System.out.println("Enter number of ending month (1-12): ");
                endDateMonth = Integer.parseInt(sc.next());

                System.out.println("Day of the month that it ends");
                endDateDay = Integer.parseInt(sc.next());

                calender.main();
                System.out.println(classStartTime + "-" + classEndTime + " " + className);
                System.out.println("Starts " + sm.getStartM() + "-" + startDateDay + " ends " + em.getEndM() + "-" + endDateDay);
                fc.setFullClass(classStartTime + "-" + classEndTime + " " + className);

                System.out.println("Press 0 to go back to menu");
                e.setEnter(Integer.parseInt(sc1.next()));

        }
    }
}
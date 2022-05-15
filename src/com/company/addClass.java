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
    static String weekday;
    static int classNum=0;
    static String fullClass1 =" ";
    static String fullClass2 =" ";
    static String fullClass3 =" ";
    static String fullClass4= " ";
    static String fullClass5 =" ";

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

    public String getWeekday(){
        return String.valueOf(weekday);
    }
    public void setWeekday(String weekday){
        this.weekday=weekday;
    }

    public String getFullClass1(){
        return fullClass1;
    }
    public String getFullClass2(){
        return fullClass2;
    }
    public String getFullClass3(){
        return fullClass3;
    }
    public String getFullClass4(){
        return fullClass4;
    }
    public String getFullClass5(){
        return fullClass5;
    }

    public int getClassNum(){return classNum;}
    public void setClassNum(int newClassNum){
        this.classNum=newClassNum;
    }

    static Scanner sc1 = new Scanner(System.in);

    static input e = new input();

    public static void main() {
        //asks the user about their class and adds it to the directory
        if (e.getEnter() == 1) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your class Schedule");

                System.out.println("Class Name: ");
                className = sc.next();

                System.out.println("Class start time: ");
                classStartTime = sc.next();

                System.out.println("Class end time: ");
                classEndTime = sc.next();

                System.out.println("enter what day of the week this class occurs (1-7)");
                System.out.println("1 represents Sunday, 7 is Saturday");
                weekday = sc.next();

                System.out.println("Enter number of start month (1-12): ");
                startDateMonth = Integer.parseInt(sc.next());

                System.out.println("Day of the month that it starts");
                startDateDay = Integer.parseInt(sc.next());

                System.out.println("Enter number of ending month (1-12): ");
                endDateMonth = Integer.parseInt(sc.next());

                System.out.println("Day of the month that it ends");
                endDateDay = Integer.parseInt(sc.next());

                calender.main();
                weekdayFinder.main();
                System.out.println("----------------------------------------");
                System.out.println(classStartTime + "-" + classEndTime + " " + className + " on "+ e.getWeek());
                System.out.println("Starts " + e.getStartM() + "-" + startDateDay + " ends " + e.getEndM() + "-" + endDateDay);
                e.setFullClass(classStartTime + "-" + classEndTime + " " + className + " on "+ e.getWeek());

                classNum+=1;
                System.out.println("----------------------------------------");
                System.out.println("Press 0 to go back to menu");
                e.setEnter(Integer.parseInt(sc1.next()));
        }
        //saves the full class to 5 different variables depending on how many classes have been added already
        if(classNum==1){
            fullClass1=e.getFullClass();
        }
        if(classNum==2){
            fullClass2=e.getFullClass();
        }
        if(classNum==3){
            fullClass3=e.getFullClass();
        }
        if(classNum==4){
            fullClass4=e.getFullClass();
        }
        if(classNum==5){
            fullClass5=e.getFullClass();
        }
    }
}
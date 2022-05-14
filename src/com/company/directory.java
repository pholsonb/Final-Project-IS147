package com.company;

import java.util.Scanner;
import java.util.*;

interface infA{
    void printClasses();
}
interface infB extends infA{
    void printAssignments();
}
class sample implements infB{
    @Override
    public void printClasses(){
        addClass fc1 = new addClass();
        System.out.println(fc1.getFullClass1());
        System.out.println(fc1.getFullClass2());
        System.out.println(fc1.getFullClass3());
        System.out.println(fc1.getFullClass4());
        System.out.println(fc1.getFullClass5());
    }
    @Override
    public void printAssignments(){
        assignment as = new assignment();
        System.out.println(as.getFullAssignment1());
        System.out.println(as.getFullAssignment2());
        System.out.println(as.getFullAssignment3());
        System.out.println(as.getFullAssignment4());
        System.out.println(as.getFullAssignment5());
    }
}

public class directory {

    static int seeMonth;
    static int seeDay;
    static Scanner sc1 = new Scanner(System.in);

    static input e = new input();

    //start month for entered class
    static addClass sm = new addClass();
    static int startDateMonth = sm.getStartDateMonth();

    //start day for entered class
    static addClass sd = new addClass();
    static int startDateDay = sd.getStartDateMonth();

    //full class description that seen
    static input fc = new input();

    //name of month that is wanted to be seen by user
    static input sem = new input();

    static input w = new input();

    static addClass fc1 = new addClass();

    static assignment as = new assignment();

    public int getSeeMonth() {
        return seeMonth;
    }

    public void setSeeMonth(int seeMonth) {
        this.seeMonth = seeMonth;
    }


    static sample ob1 = new sample();

    static Calendar c = Calendar.getInstance();


    public static void main() {

        if (e.getEnter() == 3) {

            System.out.println("The current date is "+c.get(Calendar.MONTH)+" - "+c.get(Calendar.DATE)+" - "+c.get(Calendar.YEAR));

            System.out.println("Type the number of the month you want to view (1-12): ");
            seeMonth = Integer.parseInt(sc1.next());
            System.out.println("Type day of that month you want to view: ");
            seeDay = Integer.parseInt(sc1.next());
            calender.main();
            weekdayFinder.main();


            System.out.println("----------------------------");
            System.out.println("Month of " + sem.getSeeM() + " Day " + seeDay);
            System.out.println(" ");


            if (startDateMonth <= seeMonth && startDateDay <= seeDay) {
                System.out.println("Schedule of activities:");
                ob1.printClasses();
                System.out.println(" ");
                System.out.println("dueDates");
                ob1.printAssignments();
            }

                System.out.println("----------------------------");
                System.out.println("Press 0 to go back to menu");
                e.setEnter(Integer.parseInt(sc1.next()));
            }
        }
    }






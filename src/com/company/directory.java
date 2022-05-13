package com.company;

import java.util.Scanner;

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


    public int getSeeMonth() {
        return seeMonth;
    }

    public void setSeeMonth(int seeMonth) {
        this.seeMonth = seeMonth;
    }


    public static void main() {

        if (e.getEnter() == 3) {

            System.out.println("Type the number of the month you want to view (1-12): ");
            seeMonth = Integer.parseInt(sc1.next());
            System.out.println("Type day of that month you want to view: ");
            seeDay = Integer.parseInt(sc1.next());
            calender.main();
            weekdayFinder.main();



            System.out.println("----------------------------");
            System.out.println("Month of " + sem.getSeeM() + " Day " + seeDay);
            System.out.println(" ");
            System.out.println("Schedule of activities:");

            if (startDateMonth <= seeMonth && startDateDay <= seeDay) {
                System.out.println(fc1.getFullClass1());
                System.out.println(fc1.getFullClass2());
                //System.out.println(" "+w.getWeek());
            }



                System.out.println(" ");
                //System.out.println(dueDates);
                System.out.println(" ");
                //System.out.println( to-do );
                System.out.println(" ");
                System.out.println("----------------------------");
                System.out.println("Press 0 to go back to menu");
                e.setEnter(Integer.parseInt(sc1.next()));
            }
        }
    }



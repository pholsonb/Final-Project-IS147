package com.company;

import java.util.Scanner;

public class directory {

    static int seeMonth;
    static int seeDay;
    static Scanner sc1 = new Scanner(System.in);

    static input e = new input();
    static int enter = e.getEnter();

    static addClass sm = new addClass();
    static int startDateMonth = sm.getStartDateMonth();

    static addClass sd = new addClass();
    static int startDateDay = sd.getStartDateMonth();

    static addClass fc = new addClass();
    static String fullClass = fc.getFullClass();


    public static void main() {

        if (e.getEnter() == 4) {
            System.out.println("Type the number of the month you want to view (1-12): ");
            seeMonth = Integer.parseInt(sc1.next());
            System.out.println("Type day of that month you want to view: ");
            seeDay = Integer.parseInt(sc1.next());

            if (startDateMonth <= seeMonth && startDateDay <= seeDay) {
                System.out.println("----------------------------");
                System.out.println("Month of " + seeMonth + " Day " + seeDay);
                System.out.println(fullClass);
                System.out.println(" ");
                //System.out.println(dueDates);
                System.out.println(" ");
                //System.out.println(todo);
                System.out.println(" ");
                System.out.println("----------------------------");
                System.out.println("Press 0 to go back to menu");
                e.setEnter(Integer.parseInt(sc1.next()));
            }
        }
    }
}


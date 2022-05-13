package com.company;

import java.util.Scanner;

public class assignment {

    static String aName;
    static String aClass;
    static int aDueMonth;
    static int aDueDay;

    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    static input e = new input();

    public static void main() {
        if (e.getEnter() == 2) {

            System.out.println("What is the name of the assignment: ");
            aName=sc.next();

            System.out.println("What class is the assignment for: ");
            aClass=sc.next();

            System.out.println("What month is the assignment due (1-12): ");
            aDueMonth= Integer.parseInt(sc.next());

            System.out.println("What day is the assignment due: ");
            aDueDay= Integer.parseInt(sc.next());

            System.out.println("Press 0 to go back to menu");


            e.setEnter(Integer.parseInt(sc1.next()));
        }
    }
}

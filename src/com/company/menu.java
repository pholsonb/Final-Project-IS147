package com.company;

import java.util.Scanner;

public class menu {

    static Scanner sc1 = new Scanner(System.in);

    static input e = new input();
    static int enter = e.getEnter();

    public static void main(){
        if(e.getEnter() == 0) {
            System.out.println("welcome to the Schedule Builder");
            System.out.println("Type 1 to enter a class schedule");
            System.out.println("Type 2 to enter a job schedule");
            System.out.println("Type 3 to enter a chore Schedule");
            System.out.println("Type 4 to view Schedule");

            e.setEnter(Integer.parseInt(sc1.next()));
        }
    }

}


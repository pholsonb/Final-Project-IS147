package com.company;

import java.util.Scanner;

public class menu {

    static Scanner sc1 = new Scanner(System.in);

    static input e = new input();

    public static void main(){
        //prints out main menu screen to prompt user to add class, assignment, or go to directory
        if(e.getEnter() == 0) {
            System.out.println("----------------------------------------");
            System.out.println("welcome to the Schedule Builder");
            System.out.println("Up to 5 classes and assignments can be added");
            System.out.println("----------------------------------------");
            System.out.println("Type 1 to add a class");
            System.out.println("Type 2 to add assignment");
            System.out.println("Type 3 to view Schedule");
            System.out.println("----------------------------------------");
            e.setEnter(Integer.parseInt(sc1.next()));
        }
    }
}
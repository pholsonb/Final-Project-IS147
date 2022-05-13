package com.company;

import java.util.Scanner;

public class error {

    static Scanner sc1 = new Scanner(System.in);
    static input e = new input();
    public static void main() {
        if (e.getEnter() >= 4) {
            System.out.println("error please enter number between 1-3");
            e.setEnter(Integer.parseInt(sc1.next()));
        }
        }
    }



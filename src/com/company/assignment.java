package com.company;

import java.util.Scanner;

public class assignment {

    static String aName;
    static String aClass;
    static int aDueMonth;
    static int aDueDay;
    static int assignmentNumber;
    static String fullAssignment1;
    static String fullAssignment2;
    static String fullAssignment3;
    static String fullAssignment4;
    static String fullAssignment5;

    assignment(){
        assignmentNumber=0;
    }

    public String getFullAssignment1(){
        return fullAssignment1;
    }
    public String getFullAssignment2(){
        return fullAssignment2;
    }
    public String getFullAssignment3(){
        return fullAssignment3;
    }
    public String getFullAssignment4(){
        return fullAssignment4;
    }
    public String getFullAssignment5(){
        return fullAssignment5;
    }



    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    static input e = new input();

    static input fa = new input();

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

            fa.setFullAssignment(aName+" for "+aClass+" Due " +aDueMonth+" "+aDueDay);

            assignmentNumber+=1;


            e.setEnter(Integer.parseInt(sc1.next()));
        }
        if(assignmentNumber==1){
            fullAssignment1=fa.getFullAssignment();
        }
        if(assignmentNumber==2){
            fullAssignment2=fa.getFullAssignment();
        }
        if(assignmentNumber==3){
            fullAssignment3=fa.getFullAssignment();
        }
        if(assignmentNumber==4){
            fullAssignment4=fa.getFullAssignment();
        }
        if(assignmentNumber==5){
            fullAssignment5=fa.getFullAssignment();
        }
    }
}

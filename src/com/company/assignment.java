package com.company;

import java.util.Scanner;

public class assignment {

    static String aName;
    static String aClass;
    static int aDueMonth;
    static int aDueDay;
    static int assignmentNumber=0;
    static String fullAssignment1 = " ";
    static String fullAssignment2 = " ";
    static String fullAssignment3 = " ";
    static String fullAssignment4 = " ";
    static String fullAssignment5 = " ";

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

    public static void main() {
        //asks the user questions about upcoming assignment to be added to the directory
        if (e.getEnter() == 2) {

            System.out.println("What is the name of the assignment: ");
            aName=sc.next();

            System.out.println("What class is the assignment for: ");
            aClass=sc.next();

            System.out.println("What month is the assignment due (1-12): ");
            aDueMonth= Integer.parseInt(sc.next());

            System.out.println("What day is the assignment due: ");
            aDueDay= Integer.parseInt(sc.next());

            System.out.println("----------------------------------------");
            e.setFullAssignment(aName+" for "+aClass+" Due " +aDueMonth+" "+aDueDay);
            System.out.println(e.getFullAssignment());
            System.out.println("----------------------------------------");

            System.out.println("Press 0 to go back to menu");

            assignmentNumber+=1;

            e.setEnter(Integer.parseInt(sc1.next()));
        }
        //saves the full assignment to 5 different variables depending on how many assignments have already been entered
        if(assignmentNumber==1){
            fullAssignment1=e.getFullAssignment();
        }
        if(assignmentNumber==2){
            fullAssignment2=e.getFullAssignment();
        }
        if(assignmentNumber==3){
            fullAssignment3=e.getFullAssignment();
        }
        if(assignmentNumber==4){
            fullAssignment4=e.getFullAssignment();
        }
        if(assignmentNumber==5){
            fullAssignment5=e.getFullAssignment();
        }
    }
}
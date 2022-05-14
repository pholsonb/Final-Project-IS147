package com.company;

public class input {


    static int enter = 0 ;

    static String fullClass;
    static String fullAssignment;
    static String startM;
    static String endM;
    static String seeM;
    static String week;

    public int getEnter(){return enter;}
    public void setEnter(int newEnter){
        input.enter = newEnter;
    }


    public String getWeek(){return week;}
    public void setWeek(String week){
        this.week=week;
    }

    //full class description that gets entered into directory with time and name
    public String getFullClass(){
        return fullClass;
    }
    public void setFullClass(String fullClass){
        this.fullClass=fullClass;
    }

    public String getFullAssignment(){
        return fullAssignment;
    }
    public void setFullAssignment(String fullAssignment){this.fullAssignment=fullAssignment;}

    //Start month of new added class Getter and Setter
    public String getStartM(){
        return startM;
    }
    public void setStartM(String startM){
        this.startM=startM;
    }

    //End month of new added class Getter and Setter
    public String getEndM(){
        return endM;
    }
    public void setEndM(String endM){
        this.endM=endM;
    }

    //Month that is seen in directory Getter and Setter
    public String getSeeM(){
        return seeM;
    }
    public void setSeeM(String seeM){
        this.seeM=seeM;
    }


    public static void classes() {
        for(int i = 0; i < 100; i++) {
            menu.main();
            addClass.main();
            assignment.main();
            directory.main();
            error.main();
        }
        }
        }





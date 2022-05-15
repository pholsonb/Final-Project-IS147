package com.company;

public class calender {

    static String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    //class end month number
    static addClass edm = new addClass();

    static directory seeMonth1 = new directory();

    //start month that is a string
    static input sm = new input();

    public static void main(){

    //converts month int into string version
        for(int i = 1; i < 13; i++){
            if(edm.getStartDateMonth() == i){
                sm.setStartM(month[i-1]);
            }
        }
        for(int i = 1; i < 13; i++){
            if(edm.getEndDateMonth() == i){
                sm.setEndM(month[i-1]);
            }
        }
        for(int i = 1; i < 13; i++){
            if(seeMonth1.getSeeMonth() == i){
                sm.setSeeM(month[i-1]);
            }
        }
    }
}


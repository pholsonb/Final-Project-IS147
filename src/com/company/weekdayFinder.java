package com.company;

public class weekdayFinder {

//object to get weekday from add class menu
static addClass weekday = new addClass();

static input w =new input();

//array for weekdays
static String[] day = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

public static void main(){
    //turns weekday int value into string week
    switch(weekday.getWeekday()){
        case "1":
            w.setWeek(day[0]);
            break;
        case "2":
            w.setWeek(day[1]);
            break;
        case "3":
            w.setWeek(day[2]);
            break;
        case "4":
            w.setWeek(day[3]);
            break;
        case "5":
            w.setWeek(day[4]);
            break;
        case "6":
            w.setWeek(day[5]);
            break;
        case "7":
            w.setWeek(day[6]);
            break;
    }
}
}

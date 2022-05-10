package com.company;

public class calender {

    static String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    //class start month number
    static addClass sdm = new addClass();
    static int startDateMonth = sdm.getStartDateMonth();

    //class end month number
    static addClass edm = new addClass();
    static int endDateMonth = edm.getEndDateMonth();

    static directory seeMonth1 = new directory();
    static int seeMo = seeMonth1.getSeeMonth();

    //start month that is a string
    static input sm = new input();
    static String startM = sm.getStartM();

    //end month that is a string
    static input em = new input();
    static String endM = em.getEndM();

    //month that is entered by user in directory that is a string
    static input mE = new input();
    static String monthE = mE.getSeeM();

    public static void main(){

        for(int i = 1; i < 13; i++){
            if(sdm.getStartDateMonth() == i){
                sm.setStartM(month[i-1]);
            }
        }
        for(int i = 1; i < 13; i++){
            if(edm.getEndDateMonth() == i){
                em.setEndM(month[i-1]);
            }
        }
        for(int i = 1; i < 13; i++){
            if(seeMonth1.getSeeMonth() == i){
                mE.setSeeM(month[i-1]);
            }
        }
    }
}


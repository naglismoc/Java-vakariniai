package com.companija;

import java.util.ArrayList;

public class HelperClass {

    public static double average(ArrayList<Integer> arr){
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return (double) sum / arr.size();
    }

    public static void distance(){
        System.out.println("distance");
        System.out.println("distance curve");
    }
}

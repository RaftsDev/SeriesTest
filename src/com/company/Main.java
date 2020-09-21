package com.company;

import com.company.mylibraries.Series;

public class Main {

    public static void main(String[] args) {
	// Testing Series library

        System.out.println("******** Sum ************");
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.nSum(i));
        }

        System.out.println("******** Factorial ************");
        for(int i = 0; i <= 10; i++){
            System.out.println(Series.factorial(i));
        }
    }
}

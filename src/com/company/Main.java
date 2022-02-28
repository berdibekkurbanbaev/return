package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(metod(5));

    }
    static int metod (int a) {
        int count = 0;

        for (int i = 0; i <= a; i++) {

            count+=i;
        }


        return count ;
    }
}

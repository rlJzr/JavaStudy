package org.example.ConditionalStatement;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int year = read.nextInt();

        if( (year%400 == 0) || ((year%4 == 0) && (year%100 != 0)) ){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}

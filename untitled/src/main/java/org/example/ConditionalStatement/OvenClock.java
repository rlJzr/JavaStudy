package org.example.ConditionalStatement;

import java.util.Scanner;

public class OvenClock {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int hour = read.nextInt();
        int min = read.nextInt();
        int duration = read.nextInt();
        hour += duration/60;
        min += duration%60;
        if(min>=60) { min %= 60; hour++; }
        if (hour>23) { hour-=24; }
        System.out.println(hour + " " + min);
    }
}

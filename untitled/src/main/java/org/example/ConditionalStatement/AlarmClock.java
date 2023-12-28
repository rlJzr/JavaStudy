package org.example.ConditionalStatement;

import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int hour = read.nextInt();
        int min = read.nextInt();

        if (min<45) {
            min += 15;
            if (hour == 0) {hour = 23;} else {hour--;}
        } else {min-=45;}
        System.out.println(hour + " " + min);
    }
}

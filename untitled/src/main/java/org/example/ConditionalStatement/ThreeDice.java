package org.example.ConditionalStatement;

import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        int result;

        if ( a==b && b==c && a==c ){result = 10000 + a*1000;}
        else if ( a==b || b==c ) {result = 1000 + b*100;}
        else if (a==c) {result = 1000 + a*100;}
        else {result = Math.max(a,Math.max(b,c))*100;}

        System.out.println(result);
    }
}

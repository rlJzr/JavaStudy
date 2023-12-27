package org.example.InputOutputCal;

import java.util.Scanner;

public class RemainderABC {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        System.out.println((a+b) % c);
        System.out.println(((a%c) + (b%c)) % c);
        System.out.println( (a*b) % c);
        System.out.println(((a%c) * (b%c)) % c);
    }
}

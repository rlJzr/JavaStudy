package org.example.ConditionalStatement;

import java.util.Scanner;

public class CompareAB {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        String result = (a == b) ? "==" : ((a < b) ? "<" : ">");
        System.out.println(result);
    }
}

package org.example.ConditionalStatement;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int score = read.nextInt();
        switch (score/10){
            case 10: case 9:
                System.out.println("A"); break;
            case 8:
                System.out.println("B"); break;
            case 7:
                System.out.println("C"); break;
            case 6:
                System.out.println("D"); break;
            default:
                System.out.println("F"); break;
        }
    }
}

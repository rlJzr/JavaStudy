package org.example.ConditionalStatement;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        int result = ((x*y)>0) ? ((x>0) ? 1 : 3) : ((x<0 ? 2 : 4));
        System.out.println(result);
    }
}

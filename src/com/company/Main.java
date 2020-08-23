package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b;
        if (c % 2 == 0 || (a += 2) % 2 == 0) {
            System.out.println("четное " + a);
        } else {
            System.out.println("нечетное " + a);
        }
    }
}

package com.bridgelabz;

import java.util.Scanner;

public class GetName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.next();
        System.out.println("Your name is :" +name);
    }
}

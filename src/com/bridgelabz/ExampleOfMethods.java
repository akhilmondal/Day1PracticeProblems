package com.bridgelabz;

public class ExampleOfMethods {

    static void methodA() {  //Here we declared the method.
        System.out.println("MethodA Executed ! ");
    }

    public static void main(String[] args) {
        System.out.println("Example of a Method.");
        methodA(); //Here we called the method, so that the method will get executed and the instruction will gonna run which are inside the method.
        System.out.println("We can call the method as many times we want.");
        methodA();
        methodA();
    }
}

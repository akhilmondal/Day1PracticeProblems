package com.bridgelabz;

public class StaticVariables {

    static int staticVar;
    static void method1() {
        System.out.println("Inside the method the value is : " +staticVar);
        staticVar = 50; //Here we changed the value of the static variable, so from now the value will get updated to 50.
        //Here the value of the static variable will change for all, because there will be single copy of the variable.
    }

    public static void main(String[] args) {
        System.out.println(staticVar); //Here the value of the static variable will be 0 (as it is an integer data type.)
        staticVar = 25; //Static variable initialisation with the value 25.
        System.out.println("After initialisation the value of the static variable will be :" +staticVar);
        method1();
        System.out.println("After re-initialisation of the static variable, the value will be : " +staticVar);
    }
}

package com.launchcode.java;
import java.util.Scanner;
public class Person {
    private int age;
    public Person (int initialAge){
        if (initialAge < 0){
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }
    public void amIOld(){
        if (age < 13){
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18){
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
    public void yearPasses(){
        age += 1;
    }
    public static void main (String[]args){
        System.out.println("Enter the number of ages that you will enter.");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        System.out.println("Now enter the ages; hit the carriage return key after each age.");
        for (int i = 0; i < T; i += 1){
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j +=1){
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        } //end for loop
        sc.close();
    } //end main method
} //end of class
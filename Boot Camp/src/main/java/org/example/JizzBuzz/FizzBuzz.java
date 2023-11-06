package org.example.JizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        int out = fizzbuzz(number);
    }
    public static int fizzbuzz(String num){
        switch (num){

            case ("fizz"):
                return 1;
            case ("buzz"):
                return 2;

            default: return 0;
        }
    }
}
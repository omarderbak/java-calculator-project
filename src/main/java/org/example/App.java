package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        String op;

        Scanner numbers = new Scanner(System.in);

        System.out.println("First number");
        a = numbers.nextInt();

        System.out.println("Second number");
        b = numbers.nextInt();

        System.out.println("Third number");
        c = numbers.nextInt();

        Scanner operation = new Scanner(System.in);
        System.out.println("enter operation");
        op = operation.next();

        switch (op) {
            case "+":
                System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
                break;
            case "-":
                System.out.println(a + " - " + b + " - " + c + " = " + (a - b - c));
                break;
            case "*":
                System.out.println(a + " * " + b + " * " + c + " = " + (a * b * c));
                break;
            case "/":
                System.out.println(a + " / " + b + " / " + c + " = " + (a / b / c));

        }


    }
}

/*
 * UCF COP3330 Summer 2021 Assignment 5 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;

public class solution05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        int sum, diff, prod, quot;
        String buf;

        System.out.print("What is the first number? ");
        buf = in.nextLine();

        try {
            num1 = Integer.parseInt(buf);

            System.out.print("What is the second number? ");
            buf = in.nextLine();

            num2 = Integer.parseInt(buf);

            sum = num1 + num2;
            diff = num1 - num2;
            prod = num1 * num2;
            quot = num1 / num2;

            System.out.printf(
                    num1 + " + " + num2 + " = %d\n" +
                    num1 + " - " + num2 + " = %d\n" +
                    num1 + " * " + num2 + " = %d\n" +
                    num1 + " / " + num2 + " = %d\n",
                    sum, diff, prod, quot
            );

        } catch(NumberFormatException e) {
            System.out.println("you did not enter a valid number");
        }

    }
}

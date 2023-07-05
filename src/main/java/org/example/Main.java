package org.example;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {


        double n1, n2;
        float f1, f2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi welcome to simple calculator....!!");
        boolean y = true;
        do {
            System.out.println("You now will get options please select one to proceed further..");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1-ADDITION");
            System.out.println("2-SUBTRACTION");
            System.out.println("3-MULTIPLICATION");
            System.out.println("4-DIVISION");
            System.out.println("5-exit");
            System.out.println("-----------------------------------------------------------------------");
            int num = scanner.nextInt();
            switch (num) {
                case 1: {
                    System.out.println("---ADDITION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    System.out.println("Addition");
                    double add = n1 + n2;
                    System.out.println("Addition of two numbers:" + add);
                    break;
                }
                case 2: {
                    System.out.println("---SUBTRACTION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    System.out.println("Subtraction of two numbers:");
                    double sub = n1 - n2;
                    System.out.println("Subtraction of two numbers:" + sub);
                    break;

                }
                case 3: {
                    System.out.println("---MULTIPLICATION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();

                    double mul = n1 * n2;
                    System.out.println("Multiplication of two numbers:" + mul);
                    break;
                }
                case 4: {
                    System.out.println("---DIVISION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    try {
                        double div = n1 / n2;
                        System.out.println("Division of two numbers:" + div);
                    }
                    catch (ArithmeticException ae)
                    {
                        System.out.println("ArithmeticException--"+ae.getMessage());
                    }
                    break;

                }
                case 5:
                {
                    y=false;
                    break;}
                default:

                    System.out.println("you have choose the wrong option");


            }
        }
        while (y);
    }



    }

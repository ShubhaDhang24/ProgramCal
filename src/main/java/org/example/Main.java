package org.example;

import java.util.Scanner;

class Addition
        {
            double add;
            void Add(double n1, double n2)
            {
                add=n1+n2;
                System.out.println("Addition of two numbers:" +add);

            }

        }
        class Subtraction{

                double sub;
            public void Sub(double n1, double n2) {
                System.out.println("Subtraction of two numbers:");
                sub = n1 - n2;
                System.out.println("Subtraction of two numbers:" +sub);
            }
        }
        class Multiplication{

                double mul;
            public void  Mul(double n1, double n2) {
                System.out.println("MULTIPLICATION");
                mul = n1 * n2;
                System.out.println("Multiplication of two numbers:" +mul);

            }
        }
        class Division{

                double div;
            public void Div(double n1, double n2) {
                try {
                     div = n1 / n2;
                    //System.out.println("Division of two numbers:" + div);
                }
                catch (ArithmeticException ae)
                {
                    System.out.println("ArithmeticException--"+ae.getMessage());
                }
                System.out.println("Division of two numbers:"+div);
            }
        }
public class Main {

    public static void main(String[] args) {


        double n1, n2;

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
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    System.out.println("---ADDITION---");
                    Addition ad=new Addition();
                    ad.Add(n1,n2);
                    break;
                }
                case 2: {
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    System.out.println("---SUBTRACTION---");
                    Subtraction sb=new Subtraction();
                    sb.Sub(n1,n2);
                    break;

                }
                case 3: {
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    System.out.println("---MULTIPLICATION---");
                    Multiplication ml=new Multiplication();
                    ml.Mul(n1,n2);

                    break;
                }
                case 4: {
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    System.out.println("---DIVISION---");
                    Division di= new Division();
                    di.Div(n1,n2);



                    break;

                }
                case 5:
                {
                    y=false;
                    break;
                }
                default:
                    System.out.println("you have choose the wrong option");


            }
        }
        while (y);
    }



    }

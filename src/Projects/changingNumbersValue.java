package Projects;

import java.util.Scanner;

public class changingNumbersValue {


    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("Enter first number: ");
        System.out.println("*****************************");

        int a = scanner.nextInt();
        System.out.println("*****************************");
        System.out.println("Enter second number: ");
        System.out.println("*****************************");

        int b = scanner.nextInt();
        System.out.println("first number  = "+a+" second number = "+b);
        System.out.println();
     int c =a;
     a=b;
     b=c;

        System.out.println("*******************************");
        System.out.println("after Value changed: ");
        System.out.println("*****************************");
        System.out.println("first number  = "+a+" second number = "+b);



    }
}

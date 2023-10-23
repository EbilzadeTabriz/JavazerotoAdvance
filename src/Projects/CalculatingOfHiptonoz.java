package Projects;

import java.util.Scanner;

public class CalculatingOfHiptonoz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter left side : ");
        int left = scanner.nextInt();

        System.out.print("Enter right side: ");
        int right = scanner.nextInt();

        float hiptonuz = (left + right)/2;

        System.out.println("*****************************");

        System.out.println("Hiptonuz area: "+hiptonuz);

        System.out.println("*****************************");








    }
}

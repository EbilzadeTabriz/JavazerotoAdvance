package Projects;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class maximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter thord number: ");
        int thirdNumber = scanner.nextInt();

        int max =-1;


        if (firstNumber>=secondNumber&& firstNumber>=thirdNumber){
            max = firstNumber;
            System.out.println("Max number is = "+max);

        } else if (secondNumber>=firstNumber&&secondNumber>=thirdNumber) {
            max = secondNumber;
            System.out.println("Max number is = "+max);


        } else if (thirdNumber>=firstNumber&&thirdNumber>=secondNumber) {
            max = thirdNumber;
            System.out.println("Max number is = "+max);

        }
        else {
            System.out.println("something went wrong!");
        }
    }
}

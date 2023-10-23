import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. Absolute Value");
            System.out.println("6. Square Root");

            int operation = scanner.nextInt();

            double result = 0;

            switch (operation) {
                case 1:
                    result = a + b;
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println(result = a - b);
                    break;
                case 3:
                    System.out.println(result = a / b);
                    break;
                case 4:
                    System.out.println(result = a * b);
                    break;
                case 5:
                    System.out.println("Absolute Value of a: " + Math.abs(a));
                    System.out.println("Absolute Value of b: " + Math.abs(b));
                    break;
                case 6:
                    System.out.println("Square Root of a: " + Math.sqrt(a));
                    System.out.println("Square Root of b: " + Math.sqrt(b));
                    break;
                default:
                    System.out.println("Invalid operation.");
            }

            if (operation >= 1 && operation <= 7) {
                System.out.println("Answer = " + result);
            }

            System.out.print("Do another operation? (yes/no): ");
            String continueOption = scanner.next();

            if (!continueOption.equalsIgnoreCase("yes")) {
                break;
            }
        } while (true);

        System.out.println("Calculator closed.");
    }
}

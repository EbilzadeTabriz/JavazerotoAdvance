package Projects;

import java.util.Scanner;

public class AdvanceCalculator {
    public static int cikarma(int a, int b) {
        return (a - b);
    }

    public static double bolme(int a, int b) {
        return ((double) a / b);
    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int vurma(int a, int b) {
        return (a * b);
    }

    public static int vurma(int a, int b, int c) {
        return (a * b * c);
    }

    public static int root(int a) {
        return (int) Math.sqrt(a);
    }

    public static void main(String[] args) {
        String operation = "1.toplma\n"
                + "2.cikarma\n"
                + "3.carpma\n"
                + "4.bolme\n"
                + "cikis q ya basin.";
        System.out.println("************************************");
        System.out.println(operation);
        System.out.println("**************************************");
        System.out.println("Choose operation: ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();


        while (true) {
            if (option.equals("q")){
                System.out.println("operation is over ");
                break;
            }

             if (option.equals("1")) {
                System.out.println("kac deyer toplayacaqsiniz? (2 yada 3)");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {

                    System.out.println("Enter num: ");
                    int a = scanner.nextInt();

                    System.out.println("Enter num: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin toplamlari: " + (toplama(a, b)));

                } else if (kacsayi == 3) {

                    System.out.println("Enter num: ");
                    int a = scanner.nextInt();

                    System.out.println("Enter num: ");
                    int b = scanner.nextInt();

                    System.out.println("Enter num: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayilarin toplamlari: " + (toplama(a, b, c)));


                } else {
                    System.out.println("it is invalid");
                }


            } else if (option.equals("2")) {
                System.out.println("Enter num: ");
                int a = scanner.nextInt();

                System.out.println("Enter num: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayilarin cixarma: " + (cikarma(a, b)));



                } else if (option.equals("3")) {
                System.out.println("how many number will you enter? 2 or 3 ");
                int countOfNumber = scanner.nextInt();
             if (countOfNumber==2){
                 int a = scanner.nextInt();
                 int b = scanner.nextInt();
                 System.out.println("result of operation = "+vurma(a,b));
             } else if (countOfNumber==3) {
                 System.out.print("Enter num: ");
                 int a = scanner.nextInt();
                 System.out.print("Enter num: ");
                 int b = scanner.nextInt();
                 System.out.print("Enter num: ");
                 int c = scanner.nextInt();
                 System.out.println("result of operation = "+vurma(a,b,c));
             }
             else {
                 System.out.println("Something went wrong!");
             }


            } else if (operation.equals("4")) {
                System.out.print("Enter num: ");
                int a = scanner.nextInt();
                System.out.print("Enter num: ");
                int b=scanner.nextInt();
                System.out.println("result of operation = "+bolme(a,b));

            }


        }
            }
}
package Method;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        factorial();
        factorial();
        factorial();
        factorial();
        factorial();

    }
    public static  void factorial() {

Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
int a = scanner.nextInt();
int factorial = 1;

while(a>0){
    factorial*=a;
    a--;

}
        System.out.println("factorial = "+factorial);



    }

}

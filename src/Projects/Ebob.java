package Projects;

import java.util.Scanner;

public class Ebob {
public static  int findEbob(int num1,int num2){
int ebob=1;
for (int i =1;i<=num1&&i<=num2;i++){
    if (num1%i==0&&num2%i==0){
        ebob=i;

    }
}
return ebob;
}

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a= scanner.nextInt();
        System.out.println("Enter num2: ");
        int b= scanner.nextInt();
        System.out.println("ortaq reqem: "+findEbob(a,b));


    }
}

package OOP.Bank;

import java.util.Scanner;

public class ATM {
    public void run(Hesab hesab) {
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our bank");
        System.out.println("********************");
        System.out.println("User entrance: ");
        System.out.println("********************");
        int giris_hakki =2;

        while(true){
           if (login.login(hesab)){
               System.out.println("successful ....");
               break;
           }
           else {
               System.out.println("it is unsuccessful!");
               giris_hakki-=1;
               System.out.println("remaining entrance allowance: "+giris_hakki);

           }
           if (giris_hakki==0){
               System.out.println("Your chance is over: ");
               return;
           }
        }
        System.out.println("*****************");

        String islemler = "1.Show balance\n"+
                "2.Putting money\n"
                +"3.Drawing money\n"
                +"4.leaving press q ";
        System.out.println(islemler);
        System.out.println("********************");

        while(true){
            System.out.println("Choose islem: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Process is finished!");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Balance:" +hesab.getBalance());

            } else if (islem.equals("2")) {
                System.out.println("Money you want to add: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                hesab.addMoney(amount);
                System.out.println("New balance: "+hesab.getBalance());

            } else if (islem.equals("3")) {
                System.out.println("Money you want to draw: ");
               int amount = scanner.nextInt();
               hesab.draMoney(amount);
                System.out.println("New balance: "+hesab.getBalance());
                break;
            }
            else{
                System.out.println("it is invalid ");

            }

        }

    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesab hesab = new Hesab("Kenan","123",2000);
        atm.run(hesab);
        System.out.println("Leaving program!");
    }

    }



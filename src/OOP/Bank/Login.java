package OOP.Bank;

import java.util.Scanner;

public class Login {
    public   boolean login(Hesab hesab){
  Scanner scanner = new Scanner(System.in);
  String password;
  String user_name;
        System.out.println("User name: ");
        user_name=scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();

        if (hesab.getName()!=user_name){
            return false;
        } else if (hesab.getPassword()!=password) {
            return false;
}
else {
    return true;
}

    }
}

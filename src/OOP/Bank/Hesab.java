package OOP.Bank;

public class Hesab {
    private String name, password;
    private int balance;

    public Hesab(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void addMoney(int amount){
        balance+=amount;
        System.out.println("new balance: " +balance);

    }
    public void draMoney(int amount){
        if (balance-amount<0){
            System.out.println("you do not have enough money..");
        }
        else{
            balance-=amount;
            System.out.println("new balance: "+balance);
        }
    }



}
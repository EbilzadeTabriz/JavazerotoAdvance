package OOP;

public class Account {
    private String accountNo;
    private double balance;
    private String name;
    private String email;
    private String phoneNo;

    public void showinfos(){
        System.out.println("Account No: "+ this.accountNo);
        System.out.println("Balance: "+this.balance);
        System.out.println("name: "+this.balance);
        System.out.println("Balance: "+this.balance);
        System.out.println("Phone: "+this.phoneNo);
    }

    public Account(){
//        this.accountNo="No info";
//        this.balance = 0.0;
//        this.name ="No info";
//        this.email = "No info";
        this("No info",0.0,"No info","No info","No info");

    }
    public Account(String accountNo, double balance, String name){
//        this.name =name;
//        this.balance = balance;
//        this.accountNo = accountNo;
//
//        this.phoneNo = "No info";
//        this.email = "No info";
        this(accountNo,balance,name,"No info","No info");
    }
    public Account(String accountNo, double balance, String name, String email, String phoneNo) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void addMoney(double amount){
        balance+=amount;
        System.out.println("new bakiye = "+balance);
    }
    public void drawMoney(double amount){
        if (amount>1000){
            System.out.println("you can not draw 1000 for a day");
        }
        if (balance-amount<0){
            System.out.println("you don't have enough money "+balance);
        }
        else {
            balance-=amount;
            System.out.println("new balance = "+balance);
        }
    }


    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bakiye) {
        this.balance = bakiye;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}

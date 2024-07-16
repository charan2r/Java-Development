public class Account{
    static int account_number = 20004;
    static int account_balance = 500;
public static void showdata(){
    System.out.println("Account Number = " + account_number);
    System.out.println("Account Balance = " + account_balance);
}
public static void main(String[] args){
    account_balance = account_balance + 400;
    showdata();
}
}

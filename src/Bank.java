public class Bank {
        String userName;
        double balance;
        long accountNumber;

        Bank(String userName, double balance, long accountNumber){
            this.userName = userName;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        void deposit(int amount){
            balance = balance + amount;
            System.out.println(userName + " with " + accountNumber + " has deposited the amount " + amount + " into the account with account number " + accountNumber);
            System.out.println("Balance: " + balance);
        }

        void withdraw(int amount){
            balance = balance-amount;
            System.out.println(userName + " with " + accountNumber + " has withdrawn the amount " + amount + " from the account with account number " + accountNumber);
            System.out.println("Balance: " + balance);
        }
}

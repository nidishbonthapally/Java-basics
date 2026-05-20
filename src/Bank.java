public class Bank {
        String userName;
        double balance;
        long accountNo;

        Bank(String userName, double balance, long accountNumber){
            this.userName = userName;
            this.balance = balance;
            this.accountNo= accountNumber;
        }

        void deposit(int amount){
            balance = balance + amount;
            System.out.println(userName + " with " + accountNo + " has deposited the amount " + amount + " into the account with account number " + accountNo);
            System.out.println("Balance: " + balance);
        }

        void withdraw(int amount){
            balance = balance-amount;
            System.out.println(userName + " with " + accountNo + " has withdrawn the amount " + amount + " from the account with account number " + accountNo);
            System.out.println("Balance: " + balance);
        }
}

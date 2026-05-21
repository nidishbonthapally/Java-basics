public class Bank {
        private String userName;
        private double balance;
        private long accountNo;

        public Bank(String userName, double balance, long accountNumber){
            this.userName = userName;
            this.balance = balance;
            this.accountNo= accountNumber;
        }

        public String getUserName(){
            return userName;
        }

        public double getBalance() {
        return balance;
        }

        public long getAccountNo() {
        return accountNo;
        }

        public void setUserName(String userName) {
            if(userName.length()> 3) {
                this.userName = userName;
            }else {
                System.out.println("Username should have more than 3 characters");
            }
        }

        public void setAccountNo(long accountNo) {
            if (accountNo>999999999) {
                this.accountNo = accountNo;
            }else {
                System.out.println("Invalid account number");
            }
        }

        public void setBalance(double balance) {
            if (balance>=0.0) {
                this.balance = balance;
            }else {
                System.out.println("balance cannot be less than 0.0");
            }
        }

        void deposit(int amount){
            balance = balance + amount;
            System.out.println(userName + " with " + accountNo + " has deposited the amount " + amount + " into the account with account number " + accountNo);
            System.out.println("Balance: " + balance);
        }

        void withdraw(int amount){
            if (balance>amount) {
                balance = balance - amount;
                System.out.println(userName + " with " + accountNo + " has withdrawn the amount " + amount + " from the account with account number " + accountNo);
                System.out.println("Balance: " + balance);
            }
            else {
                System.out.println("Insufficient balance");
                System.out.println("Balance: " + balance);
            }

        }
    }

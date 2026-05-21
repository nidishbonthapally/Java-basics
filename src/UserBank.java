public class UserBank {
    public static void main(String[] args) {
        Bank u1 = new Bank("John Doe", 100000.55, 1015237892);
        Bank u2 = new Bank("John Boe", 50000, 1239638527);

        u1.withdraw(20000);
        u1.deposit(50000);

        u2.withdraw(10000);
        u2.deposit(5000);

        System.out.println(u1.getBalance());
        System.out.println(u1.getAccountNo());
        System.out.println(u1.getUserName());
        u2.withdraw(50000000);
    }
}

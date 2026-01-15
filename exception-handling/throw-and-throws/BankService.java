class BankService {

    // Method declares exception using 'throws'
    public void withdraw(double balance, double amount) throws Exception {

        if (amount > balance) {
            // Explicitly throwing exception using 'throw'
            throw new Exception("Insufficient balance");
        }

        System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
    }
}

public class ThrowVsThrows {

    public static void main(String[] args) {

        BankService service = new BankService();

        try {
            service.withdraw(5000, 7000);
        } catch (Exception e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}
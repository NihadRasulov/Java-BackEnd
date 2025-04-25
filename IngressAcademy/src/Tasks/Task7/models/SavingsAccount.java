package Tasks.Task7.models;

public class SavingsAccount extends BankAccount {
    //    public SavingsAccount(String ownerName, String accountNumber, String pinCode) {
    //    }
    public SavingsAccount(String ownerName, String accountNumber, String pinCode) {
        super(ownerName, accountNumber, pinCode);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.04; // 4%
        System.out.println("Faiz: " + interest + " AZN");
    }
}
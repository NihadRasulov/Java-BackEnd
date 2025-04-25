package Tasks.Task7.models;

public class FixedDepositAccount extends BankAccount{
    public FixedDepositAccount(String ownerName, String accountNumber, String pinCode) {
        super(ownerName, accountNumber, pinCode);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.06; // 6%
        System.out.println("Faiz: " + interest + " AZN");
    }
}
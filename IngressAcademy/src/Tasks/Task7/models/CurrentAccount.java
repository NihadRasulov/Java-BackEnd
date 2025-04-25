package Tasks.Task7.models;

public class CurrentAccount extends BankAccount {
//    public CurrentAccount(String ownerName, String accountNumber, String pinCode) {
//    }

    public CurrentAccount(String ownerName, String accountNumber, String pinCode) {
        super(ownerName, accountNumber, pinCode);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.02; // 2%
        System.out.println("Faiz: " + interest + " AZN");
    }
}

package Default;

public class Account {
    String cardNumber;
    String nameSurame;
    double balance;

    Account(String cardNumber, String nameSurame, double balance) {
        this.cardNumber = cardNumber;
        this.nameSurame = nameSurame;
        this.balance = balance;
    }
    public String toString() {
        return String.format("CardNumber: %s, Name: %s, Balance: %.2f", cardNumber, nameSurame, balance );
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNameSurame() {
        return nameSurame;
    }

    public void setNameSurame(String nameSurame) {
        this.nameSurame = nameSurame;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
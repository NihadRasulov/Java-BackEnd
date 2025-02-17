import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ABB {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList();
        Account account1 = new Account("4169738889632737","RAQSANA VALIYEVA",100);
        Account account2 = new Account("4169738804696320","XAYALA CAFAROVA",204);
        Account account3 = new Account("4169738804744716","XAYALA CAFAROVA",2000);
        accounts.addAll(Arrays.asList(account1, account2,account3));
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
        System.out.println(transfer(accounts));

        for (Account account : accounts) {
            System.out.println(account);
        }

    }
    static String transfer(ArrayList<Account> accounts) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account Your account cart number: ");
        String card = input.nextLine();

        System.out.print("Enter sended card number: ");
        String card2 = input.nextLine();

        Account sender = null;
        Account receiver = null;

        for (Account account : accounts) {
            if (account.getCardNumber().equals(card)) {
                sender = account;
            }
            if (account.getCardNumber().equals(card2)) {
                receiver = account;
            }
        }

        if (sender == null) {
            return "Sender not found";
        }
        if (receiver == null) {
            return "Receiver not found";
        }

        System.out.print("Input the amoun to sent: ");
        double amount = input.nextDouble();

        if (amount > sender.getBalance() || amount < 0) {
            return "Insufficient balance";
        }
        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        return "Transfer successful";
    }
}
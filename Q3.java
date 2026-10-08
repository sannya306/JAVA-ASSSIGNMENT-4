import java.util.HashMap;
import java.util.Scanner;
class BankDirectory {
    HashMap<Integer, String> accounts = new HashMap<>();
    void addAccount(int accountNo, String customerName) {
        accounts.put(accountNo, customerName);
        System.out.println("Account added successfully.");
    }
    void getCustomer(int accountNo) {
        System.out.println("Account No: " + accountNo +
                           " → " + accounts.get(accountNo));
    }
    void displayAll() {
        for (Integer accountNo : accounts.keySet()) {
            System.out.println("Account No: " + accountNo +
                               " → " + accounts.get(accountNo));
        }
    }
}
public class Q3_BankDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankDirectory bank = new BankDirectory();
        System.out.println("1. Add Account");
        System.out.println("2. Get Customer Name");
        System.out.println("3. Display All Accounts");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.print("Enter Account No: ");
            int accountNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();
            bank.addAccount(accountNo, name);
            bank.getCustomer(accountNo);
        }
    }
}

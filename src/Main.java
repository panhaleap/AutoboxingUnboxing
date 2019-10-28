import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting banking application...");
        Bank bank = new Bank("ABA");
        bank.addNewBranch("Toul Kork");
        bank.addNewCustomer("Toul Kork", "Panha Leap", 100d);
        bank.addNewCustomer("Toul Kork", "Menghor Leap", 200d);
        bank.addNewCustomer("Toul Kork", "Kim", 10d);
        bank.displayCustomers("Toul Kork", true);

        bank.addNewBranch("Bak Touk");
        bank.addNewCustomer("Bak Touk", "Srey Ra", 199d);
        bank.addNewCustomer("Bak Touk", "Van", 109d);
        bank.displayCustomers("Bak Touk", true);
    }
}

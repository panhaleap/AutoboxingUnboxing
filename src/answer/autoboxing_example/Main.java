package answer.autoboxing_example;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Starting Banking Application . . .");

//        System.out.print("Enter the name of Bank: ");
//        String bankName = scanner.nextLine(); /* Bank name */
//        Bank bank = new Bank(bankName);
//
//        // Add a new branch
//        System.out.print("\nEnter the name of Branch: ");
//        String branchName = scanner.nextLine(); /* Branch name */
//        if(bank.addNewBranch(branchName)) {
//            System.out.println(branchName + " Branch Added");
//        }

        Bank bank = new Bank("National Australia Bank");

        bank.addNewBranch("Adelaide");
        bank.addNewBranch("Adelaide");

        bank.addNewCustomer("Adelaide", "Tim", 50.05);
        bank.addNewCustomer("Adelaide", "Mike", 175.34);
        bank.addNewCustomer("Adelaide", "Percy", 220.12);

        bank.addNewBranch("Sydney");
        bank.addNewCustomer("Sydney", "Bob", 150.54);

        bank.addNewTransaction("Adelaide", "Tim", 44.22);
        bank.addNewTransaction("Adelaide", "Tim", 12.44);
        bank.addNewTransaction("Adelaide", "Mike", 1.65);

        bank.displayCustomers("Adelaide", true);
        bank.displayCustomers("Sydney", true);

        bank.addNewBranch("Melbourne");

        if(!bank.addNewCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addNewBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addNewTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addNewCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }

        bank.displayCustomers("Melbourne", true);

    }
}


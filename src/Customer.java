import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initailTransation) {
        this.customerId = customerId;
        this.customerName = customerName;
        transactions = new ArrayList<>();
        this.transactions.add(initailTransation);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Double> getTransaction() {
        return transactions;
    }

    public void setTransaction(double transactions) {
        this.transactions.add(transactions);
    }

    public void displayTransaction(){
        System.out.println("There are total "+transactions.size() +" transactions for customer "+customerName);
        System.out.println("Transaction:");
        int position = 0;
        for (double transaction : transactions){
            System.out.println(String.format("[%d] %f", (position+1), transaction));
            position++;
        }
    }
}

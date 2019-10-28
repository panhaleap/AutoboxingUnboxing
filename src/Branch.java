import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initializeTransaction){
        if(findCustomerPosition(customerName) >= 0){
            System.out.println("This customer " + customerName +" already existed, can not add!");
            return false;
        }
        customers.add(new Customer(customerName, initializeTransaction));
        System.out.println("Customer "+ customerName +" added successfully for branch " + branchName);
        return true;
    }

    public boolean addNewTransaction(String customerName, double newTransaction){
        Customer customer = findCustomer(customerName);
        if(customer == null){
            System.out.println("Customer "+ customerName + " isn't exist, can not add additional transaction!");
            return false;
        }
        customer.setTransaction(newTransaction);
        System.out.println("Transaction of amount "+ newTransaction +" has been add to customer "+ customerName +" at Branch "+ branchName);
        return true;
    }

    private Customer findCustomer(String customerName){
        int postion = findCustomerPosition(customerName);
        if (postion >= 0){
            return customers.get(postion);
        }
        return null;
    }

    private int findCustomerPosition(String customerName){
        int pos = 0;
        for(Customer customer : customers){
            if(customer.getCustomerName().equalsIgnoreCase(customerName)){
                return pos;
            }
            pos++;
        }
        return -1;
    }

    public void displayCustomers(boolean isDisplayTransactions){
        int position = 0;
        System.out.println("There are "+ customers.size() +" customers in Branch "+ branchName);
        System.out.println("Customers: ");
        for(Customer customer : customers){
            System.out.println(String.format("%d -> %s", (position + 1), customer.getCustomerName()));
            if(isDisplayTransactions){
                customer.displayTransaction();
            }
            position++;
        }
    }
}


















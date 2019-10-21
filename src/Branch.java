import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String branchName, ArrayList<Customer> customers) {
        this.branchName = branchName;
        this.customers = customers;
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

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void setCustomer(Customer customer){
        customers.add(customer);
    }

    public void setCustomerAdditionalAmount(String customerName, double customerAmount){
        findCustomer(customerName).setAmount(1000d);
    }

    public Customer findCustomer(String customerName){
        Customer customer = null;
        for(Customer c: customers){
            if(c.getCustomerName().equalsIgnoreCase(branchName)){
                customer = c;
            }
        }
        return customer;
    }
}


















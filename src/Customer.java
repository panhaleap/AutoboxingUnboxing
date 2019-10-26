import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String customerName;
    private ArrayList<Double> amounts;

    public Customer(int customerId, String customerName, ArrayList<Double> amounts) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.amounts = amounts;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Double> getAmounts() {
        return amounts;
    }

    public void setAmounts(ArrayList<Double> amounts) {
        this.amounts = amounts;
    }

    public void setAmount(Double amount) {
        this.amounts.add(amount);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void withDraw(double withDrawAmount){
//        this.amounts = this.amounts - withDrawAmount;
    }
}

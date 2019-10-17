import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> amounts;

    public Customer(String customerName, ArrayList<Double> amounts) {
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
}

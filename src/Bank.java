import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String bankName, ArrayList<Branch> branches) {
        this.bankName = bankName;
        this.branches = branches;
    }
}

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public boolean addNewBranch(String branchName){
        if(findBranchPostion(branchName) >= 0){
            System.out.println("Branch "+ branchName +" already exist, can not add!");
            return false;
        }
        branches.add(new Branch(branchName));
        System.out.println("Added Branch "+ branchName +" to bank "+ bankName +" successfully!");
        return true;
    }

    public boolean addNewCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch == null){
            System.out.println("Branch "+branchName +" not found! Can not add new customer!");
            return false;
        }
        return branch.addNewCustomer(customerName, initialTransaction);
    }

    public boolean addNewTransaction(String branchName, String customerName, double newTransaction){
        Branch branch = findBranch(branchName);
        if(branch == null){
            System.out.println("Branch "+branchName +" not found! Can not add transaction!");
            return false;
        }
        return branch.addNewTransaction(customerName, newTransaction);
    }

    private Branch findBranch(String branchName){
        for(Branch branch : branches){
            if(branch.getBranchName().equalsIgnoreCase(branchName)){
                return branch;
            }
        }
        return null;
    }
    private int findBranchPostion(String branchName){
        int position = 0;
        for(Branch branch : branches){
            if(branch.getBranchName().equalsIgnoreCase(branchName)){
                return position;
            }
            position++;
        }
        return -1;
    }

    public void displayCustomers(String branchName,boolean isDisplayTransaction){
        Branch branch = findBranch(branchName);
        if(branch == null){
            System.out.println("Invalid branch name "+branchName +", no customer result!");
            return;
        }
        branch.displayCustomers(isDisplayTransaction);
    }
}

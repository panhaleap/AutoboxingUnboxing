import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String bankName, ArrayList<Branch> branches) {
        this.bankName = bankName;
        this.branches = branches;
    }

    public void addBranch(Branch branch){
        branches.add(branch);
    }

    public void addCustomer(String branchName, Customer customer){
        findBranch(branchName).setCustomer(customer);
    }

    public void addTransaction(){
        new Branch(null, null).getCustomers().get(1).setAmount(1000d);
    }

    public Branch findBranch(String branchName){
       Branch branch = null;
       for(Branch br: branches){
           if(br.getBranchName().equalsIgnoreCase(branchName)){
               branch = br;
           }
       }
       return branch;
    }

    public boolean isBranchExist(String branchName){
        boolean found = false;
        for(Branch br: branches){
            found = br.getBranchName().equalsIgnoreCase(branchName);
        }
        return found;
    }
}

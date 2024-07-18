abstract class Branch {
    protected int minimumBalance;
    public Branch(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    abstract void validatePhotoProof(String proof);
    abstract void validateAddressProof(String proof);
    public void openAccount(String photoProof, String addressProof, int depositAmount) {
        if (depositAmount < minimumBalance) {
            System.out.println("Minimum balance requirement not met.");
            return;
        }
        
        validatePhotoProof(photoProof);
        validateAddressProof(addressProof);

        System.out.println("Account opened successfully!");
    }
}
class SpecificBranch extends Branch {
    public SpecificBranch(int minimumBalance) {
        super(minimumBalance);
    }
    void validatePhotoProof(String proof) {
        System.out.println("Validating photo proof in this branch...");
    }
    void validateAddressProof(String proof) {
        System.out.println("Validating address proof in this branch...");
    }
}
class SpecificBranch2 extends Branch {
    public SpecificBranch2(int minimumBalance) {
        super(minimumBalance);
    }
    void validatePhotoProof(String proof) {
        System.out.println("Validating photo proof in this branch2...");
    }
    void validateAddressProof(String proof) {
        System.out.println("Validating address proof in this branch2...");
    }
}
class SpecificBranch3 extends Branch {
    public SpecificBranch3(int minimumBalance) {
        super(minimumBalance);
    }
    void validatePhotoProof(String proof) {
        System.out.println("Validating photo proof in this branch3...");
    }
    void validateAddressProof(String proof) {
        System.out.println("Validating address proof in this branch3...");
    }
}

public class Main {
    public static void main(String[] args) {
        SpecificBranch branch = new SpecificBranch(1000);
        branch.openAccount("ID Proof", "Address Proof", 1500);
        SpecificBranch2 branch2 = new SpecificBranch2(1000);
        branch2.openAccount("ID Proof", "Address Proof", 1500);
        SpecificBranch3 branch3 = new SpecificBranch3(1000);
        branch3.openAccount("ID Proof", "Address Proof", 1500);
    }
}

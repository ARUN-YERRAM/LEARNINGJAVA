class Registration {
    private String customerName;
    private String[] phoneNumbers;
    private String passportNumber;
    private String licenseNumber;
    private String panCardNumber;
    private String voterId;

    // Constructor for passport
    public Registration(String customerName, String passportNumber, String phoneNumber1, String phoneNumber2) {
        this.customerName = customerName;
        this.passportNumber = passportNumber;
        this.phoneNumbers = new String[]{phoneNumber1, phoneNumber2};
    }

    // Constructor for license and pan card
    public Registration(String customerName, String licenseNumber, String panCardNumber, String phoneNumber1, String phoneNumber2, boolean dummy) {
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.panCardNumber = panCardNumber;
        this.phoneNumbers = new String[]{phoneNumber1, phoneNumber2};
    }

    // Constructor for voter id and license
    public Registration(String customerName, String voterId, String licenseNumber, String phoneNumber1, String phoneNumber2, int dummy) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenseNumber = licenseNumber;
        this.phoneNumbers = new String[]{phoneNumber1, phoneNumber2};
    }

    // Constructor for pan card and voter id
    public Registration(String customerName, String panCardNumber, String voterId, String phoneNumber1, String phoneNumber2, long dummy) {
        this.customerName = customerName;
        this.panCardNumber = panCardNumber;
        this.voterId = voterId;
        this.phoneNumbers = new String[]{phoneNumber1, phoneNumber2};
    }

    // Method to display registration details
    public void displayRegistrationDetails() {
        System.out.println("Congratulations " + customerName + "!!! you have been successfully registered for our services with the following details:");
        if (passportNumber != null) {
            System.out.println("Passport number: " + passportNumber);
        } else if (licenseNumber != null && panCardNumber != null) {
            System.out.println("License number: " + licenseNumber);
            System.out.println("Pan card number: " + panCardNumber);
        } else if (voterId != null && licenseNumber != null) {
            System.out.println("Voter id: " + voterId);
            System.out.println("License Number: " + licenseNumber);
        } else if (panCardNumber != null && voterId != null) {
            System.out.println("Pan card Number: " + panCardNumber);
            System.out.println("Voter id: " + voterId);
        }
        System.out.println("Phone numbers:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}

public class RegistrationTester {
    public static void main(String[] args) {
        // Sample inputs and outputs
        Registration customer1 = new Registration("Kevin", "MN989IN", "9452425421", "7676765252");
        customer1.displayRegistrationDetails();

        Registration customer2 = new Registration("Julias", "123", "PN7878", "2345615451", "6763562562", true);
        customer2.displayRegistrationDetails();

        Registration customer3 = new Registration("Jammy", "45453", "765", "9634524353", "9887373737", 1);
        customer3.displayRegistrationDetails();

        Registration customer4 = new Registration("Rose", "PN8934", "34356", "9867456367", "7645367356", 1L);
        customer4.displayRegistrationDetails();
    }
}

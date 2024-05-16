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

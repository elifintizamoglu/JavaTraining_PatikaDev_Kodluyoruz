package Week5.Hw_InsuranceManagement;

public class AddressManager {
    public static void addAddress(User user, Address address) {
        user.getAddresses().add(address);
    }

    public static void removeAddress(User user, Address address) {
        user.getAddresses().remove(address);
    }
}
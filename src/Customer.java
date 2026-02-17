public class Customer extends User {

    public Customer(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Customer cannot manage services.");
    }

    @Override
    public void useService(Service s) {
        System.out.println("Customer using: " + s.getServiceName());
        s.performService();
    }
}

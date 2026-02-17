public class Admin extends User {

    public Admin(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void manageService(Service s) {
        System.out.println("Admin managing: " + s.getServiceName());
        s.activateService();
    }

    @Override
    public void useService(Service s) {
        System.out.println("Admin using: " + s.getServiceName());
        s.performService();
    }
}

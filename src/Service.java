public abstract class Service {

    private String serviceName;
    private int serviceId;
    private boolean isActive;

    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.isActive = false;
    }

    public void activateService() {
        isActive = true;
        System.out.println(serviceName + " is activated.");
    }

    public void deactivateService() {
        isActive = false;
        System.out.println(serviceName + " is deactivated.");
    }

    public boolean isActive() {
        return isActive;
    }

    public String getServiceName() {
        return serviceName;
    }

    public abstract void performService();
}

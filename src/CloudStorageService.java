public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    private boolean isPremium = false;
    private int usedStorage = 50;

    public CloudStorageService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("Cloud storage is not active.");
            return;
        }

        System.out.println("Storing files. Used: " + usedStorage + "GB");
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("Cloud storage upgraded to premium. More space unlocked.");
    }

    @Override
    public void generateBill() {
        int cost = usedStorage * 2;
        System.out.println("Cloud storage bill: $" + cost);
    }
}

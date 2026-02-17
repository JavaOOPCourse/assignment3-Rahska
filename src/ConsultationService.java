public class ConsultationService extends Service
        implements Billable {

    private int sessionCount = 3;

    public ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("Consultation service is not active.");
            return;
        }

        System.out.println("Online consultation session started.");
    }

    @Override
    public void generateBill() {
        int cost = sessionCount * 30;
        System.out.println("Consultation bill: $" + cost);
    }
}

package chain.of.responsibility;

public class VP extends Handler {
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.PURCHASE && request.getAmount() < 1500) {
            System.out.println("VP can approve purchases below 1500.");
        } else {
            successor.handleRequest(request);
        }
    }
}

package chain.of.responsibility;

public class Director extends Handler {

    public void handleRequest(Request request) {
        if (request.getType() == RequestType.CONFERENCE) {
            System.out.println("Director can handle conferences.");
        } else {
            successor.handleRequest(request);
        }
    }
}

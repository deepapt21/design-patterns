package chain.of.responsibility;

public class CEO extends Handler {

    public void handleRequest(Request request) {
        System.out.println("CEO can approve anything.");
    }
}

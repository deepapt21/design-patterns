package chain.of.responsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Director dir = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        dir.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request req1 = new Request(RequestType.CONFERENCE);
        dir.handleRequest(req1);

        Request req2 = new Request(RequestType.PURCHASE, 1000);
        dir.handleRequest(req2);

        Request req3 = new Request(RequestType.PURCHASE, 2000);
        dir.handleRequest(req3);
    }
}

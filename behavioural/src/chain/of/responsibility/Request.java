package chain.of.responsibility;

public class Request {

    private RequestType type;

    private Integer amount;

    public Request(RequestType type, Integer amount) {
        this.type = type;
        this.amount = amount;
    }

    public Request(RequestType type) {
        this.type = type;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public RequestType getType() {
        return this.type;
    }

}

package pl.altkom.ioc;

public class Mail {
    private Message message;
    private double price;

    public Mail() {
    }

    public Mail(Message message, double price) {
        this.message = message;
        this.price = price;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "message=" + message +
                ", price=" + price +
                '}';
    }
}

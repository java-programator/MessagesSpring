package pl.altkom.ioc;

public class Message {
    private String to;
    private String text;

    public Message() {
    }

    public Message(String to, String text) {
        this.to = to;
        this.text = text;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "to='" + to + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

public class SentMessage extends Message {
    public SentMessage(String recipient, String messageText) {
        super(recipient, messageText, "Sent");
    }
}

public class DisregardedMessage extends Message {
    public DisregardedMessage(String recipient, String messageText) {
        super(recipient, messageText, "Disregard");
    }
}

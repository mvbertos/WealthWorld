public class MessageDispatcher {
    // Begin Singleton:
    private static MessageDispatcher instance = null;

    private MessageDispatcher() {
    }

    public static MessageDispatcher getInstance() {
        if (instance == null) {
            instance = new MessageDispatcher();
        }
        return instance;
    }
    // END SINGLETON

    public void dispatchMessage(Character sender, Character receiver, String msg, Object extInfo) {
        Message message = new Message(sender, receiver, msg, extInfo);
        deliverMessage(receiver, message);
    }

    private void deliverMessage(Character receiver, Message msg) {
        if (!receiver.handleMessages(msg)) {
            System.out.println("Cannot handle, error!");
        }
    }
}
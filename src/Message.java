public class Message {
    private Character sender;
    private Character receiver;
    private String msg;    
    private Object extraInfo;
    
    public Message(Character sender, Character receiver, String msg, Object extraInfo) {
        this.sender = sender;
        this.receiver = receiver;
        this.msg = msg;
        this.extraInfo = extraInfo;
    }
    
    public String getMessage() {
        return msg;
    }    
}

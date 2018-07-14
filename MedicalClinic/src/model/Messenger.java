package Entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Messenger {
    
    protected List<Message> sent;
    protected List<Message> received;

    protected Messenger() {
        sent = new ArrayList<>();
        received = new ArrayList<>();
    }
    
    protected void newMessage(Messenger receiver, Message message) {
        this.sent.add(message);
        receiver.getReceived().add(message); 
    } 

    public List<Message> getSent() {
        return sent;
    }

    public List<Message> getReceived() {
        return received;
    }
    
}

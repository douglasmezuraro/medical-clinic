package Entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Messenger {
    
    private List<Message> sent;
    private List<Message> received;

    public Messenger() {
        sent = new ArrayList<>();
        received = new ArrayList<>();
    }

    public List<Message> getSent() {
        return sent;
    }

    public List<Message> getReceived() {
        return received;
    }
    
    public void sentMessage(Messenger receiver, Message message) {
        receiver.getReceived().add(message);  
    };
    
}

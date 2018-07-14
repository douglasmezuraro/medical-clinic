package Entities;

public class Phone extends Messenger {
    
    private String number = "";

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public void newMessage(Phone receiver, String message) {
        Message newMessage = new Message();
        newMessage.setMessage(message);
        newMessage.setSender(number);
        newMessage.setReceiver(receiver.getNumber());
        
        super.newMessage(receiver, newMessage);
    }
    
}

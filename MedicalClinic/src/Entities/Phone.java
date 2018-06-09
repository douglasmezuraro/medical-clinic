package Entities;

public class Phone extends Messenger {
    
    private String number = "";

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public void sentMessage(Phone receiver, String message) {
        Message m = new Message();
        m.setMessage(message);
        m.setSender(number);
        m.setReceiver(receiver.getNumber());
        super.sentMessage(receiver, m);
    }
    
}

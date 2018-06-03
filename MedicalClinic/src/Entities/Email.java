package Entities;

public class Email extends Messenger {
   
    private String address;
    
    public Email() {
        address = "";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void sentMessage(Email receiver, String message) {
        Message m = new Message();
        m.setMessage(message);
        m.setSender(address);
        m.setReceiver(receiver.getAddress());
        super.sentMessage(receiver, m);
    }
    
}

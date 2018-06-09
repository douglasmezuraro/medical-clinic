package Entities;

public class Email extends Messenger {
   
    private String address = "";

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void sentMessage(Email receiver, String message) {
        Message newMessage = new Message();
        newMessage.setMessage(message);
        newMessage.setSender(address);
        newMessage.setReceiver(receiver.getAddress());
        
        super.sentMessage(receiver, newMessage);
    }
    
}

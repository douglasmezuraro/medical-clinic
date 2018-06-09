package Entities;

import Classes.Base;
import java.util.Date;

public abstract class Person extends Base {

    protected String name;
    protected String lastName;
    protected Date birth;
    protected String address;
    protected String contact;
    protected Email email;
    protected Phone phone;
    
    public Person() {
        email = new Email();
        phone = new Phone();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return String.format(
            "NOME: %s\nSOBRENOME: %s\nNASCIMENTO: %tH\nENDEREÇO: %s\nCONTATO: %s\nE-MAIL: %s\nTELEFONE: %s", 
            name,
            lastName,
            birth,
            address,
            contact,
            email.getAddress(),
            phone.getNumber()).toUpperCase();
    }    
    
}

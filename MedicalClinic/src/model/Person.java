package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import utils.Constants;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person extends Base {
    
    @Column(length = Constants.SHORT_DESCRIPTION)
    protected String name;
    
    @Column(length = Constants.SHORT_DESCRIPTION)
    protected String lastName;
   
    @Temporal(TemporalType.DATE)
    protected Date birth;
    
    @Column(length = Constants.LONG_DESCRIPTION)
    protected String address;
    
    @Column(length = Constants.DESCRIPTION)
    protected String contact;
    
    @Transient
    protected Email email;
    
    @Transient
    protected Phone phone;
    
    protected Person() {
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
      
}

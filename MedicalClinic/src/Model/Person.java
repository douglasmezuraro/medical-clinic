package Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import Utils.Constants;
import java.time.Instant;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
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
        return birth == null ? Date.from(Instant.now()) : birth;
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
      
}

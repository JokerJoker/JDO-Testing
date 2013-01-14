package dazuihouzi;
import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Customer {
    
    @Persistent
    private String firstName;
    @Persistent
    private String lastName;
    @Persistent
    private Date hireDate;
    @Persistent
    private String email;
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
    
    public void setKey(Key key) {
        this.key = key;
    }
    public void setFirstName(String fn) {
        this.firstName = fn;
    }
    public void setLastName(String ln) {
        this.lastName = ln;
    }
    public void setHireDate(Date da){
    	this.hireDate = da;
    }
    public void setEmail(String em){
    	this.email = em;
    }
    public String getFirstName(){
    	return firstName;
    }
    public String getLastName(){
    	return lastName;
    }
    public Date getHireDate(){
    	return hireDate;
    }
    public String getEmail(){
    	return email;
    }
	public Customer() {
		super();
	}
}
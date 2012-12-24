package dazuihouzi;
import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class customer {
    
    @Persistent
    private String firstName;
 
    @Persistent
    private String lastName;
 
    @Persistent
    private Date hireDate;
    
    public void setFirstName(String fn) {
        this.firstName = fn;
    }
    public void setLastName(String ln) {
        this.lastName = ln;
    }
    public void setHireDate(Date da){
    	this.hireDate = da;
    }

    public String getFirstName(){
    	return firstName;
    }
    public String getLastName(){
    	return lastName;
    }
    public Date hireDate(){
    	return hireDate;
    }
	public customer() {
		super();
	}
}
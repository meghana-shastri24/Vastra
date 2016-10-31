package meghana.model;

import java.io.Serializable;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress implements Serializable {
	
    private static final long serialVersionUID = -6091579459463730482L;


	@Id
	@GeneratedValue
	private int bid;
	
	private String baddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	SignUpForm signup;

	public SignUpForm getSignup() {
		return signup;
	}

	public void setSignup(SignUpForm signup) {
		this.signup = signup;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBaddress() {
		return baddress;
	}

	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}
	
	
	
}

package meghana.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private int cartid;
	
	private double grandtotal;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	@JsonIgnore
	SignUpForm signup;

	@OneToMany(mappedBy="cart", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<CartItems> cartitems;
	
	
	
	public List<CartItems> getCartitems() {
		return cartitems;
	}

	public void setCartitems(List<CartItems> cartitems) {
		this.cartitems = cartitems;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public double getGrandtotal() {
		return grandtotal;
	}

	public void setGrandtotal(double grandTotal2) {
		this.grandtotal = grandTotal2;
	}

	public SignUpForm getSignup() {
		return signup;
	}

	public void setSignup(SignUpForm signup) {
		this.signup = signup;
	}
	
	
	
	
	
}

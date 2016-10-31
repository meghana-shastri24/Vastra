package meghana.model;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.*;


import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.validator.constraints.Email;


@Entity
@Table(name="customer")
public class SignUpForm implements Serializable {
    
	private static final long serialVersionUID = 5140900014886997914L;

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	@Size(min=6, max=20)
	private String password;
	
	@NotEmpty(message="Passwords doesnt match")
	@Size(min=6, max=20)
	private String confirmPassword;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotNull
	private long phonenumber;
	
	@NotEmpty
	private String address;
		
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	LoginForm login;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bid")
	BillingAddress bad;
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cartid")
	@JsonIgnore
	Cart cart;
	
	
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public BillingAddress getBad() {
		return bad;
	}
	public void setBad(BillingAddress bad) {
		this.bad = bad;
	}
		public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LoginForm getLogin() {
		return login;
	}
	public void setLogin(LoginForm login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		checkPassword();
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
		checkPassword();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private void checkPassword()
	{
		if(this.password==null||this.confirmPassword==null)
			return;
		else if(!this.password.equals(confirmPassword))
			this.confirmPassword=null;
		
	}
}

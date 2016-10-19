package meghana.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;


import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Email;


@Entity
@Table(name="customer")
public class SignUpForm {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	
	@NotEmpty
	String username;
	
	@NotEmpty
	@Size(min=6, max=20)
	String password;
	
	@NotEmpty
	@Size(min=6, max=20)
	String confirmPassword;
	
	@NotEmpty
	@Email
	String email;
	
	
	@NotEmpty
	String address;
		
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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
	
}

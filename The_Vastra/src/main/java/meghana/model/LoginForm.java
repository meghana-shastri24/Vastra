package meghana.model;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="CustomerLogin")
public class LoginForm implements Serializable {
	
	

	@Id
	@GeneratedValue
	public int cid;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private SignUpForm signup;
	
public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public SignUpForm getSignup() {
		return signup;
	}
	public void setSignup(SignUpForm signup) {
		this.signup = signup;
	}

@NotEmpty
 @Email
	private String email;
 @NotEmpty
 @Size(min=6,max=20)
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}


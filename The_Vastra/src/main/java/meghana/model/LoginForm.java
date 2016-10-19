package meghana.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="CustomerLogin")
public class LoginForm {

	@Id
	public int id;
	
	
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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


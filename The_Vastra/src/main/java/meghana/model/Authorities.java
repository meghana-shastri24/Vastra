package meghana.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Authorities {

    @Id
    @GeneratedValue
    private int authId;
    private String username;
    private String authority;
    public int id;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuthoritiesId() {
        return authId;
    }

    public void setAuthoritiesId(int authId) {
        this.authId = authId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}

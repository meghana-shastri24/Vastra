package meghana.Dao;

import meghana.model.SignUpForm;

public interface SignUpDao {

	
	public void addCustomer(SignUpForm p);
	
	public SignUpForm getCustomerByUsername(String username);
}

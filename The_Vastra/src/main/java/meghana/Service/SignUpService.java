package meghana.Service;


import meghana.Dao.SignUpDao;
import meghana.model.SignUpForm;

public interface SignUpService {
	
	public void setPersonDAO(SignUpDao productDAO);
	
	  public void addCustomer(SignUpForm p);
	  
	  public SignUpForm getCustomerByUsername(String username);

}

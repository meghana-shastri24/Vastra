package meghana.Service.impl;

import meghana.Dao.SignUpDao;
import meghana.Dao.impl.SignUpDaoImpl;

import meghana.Service.SignUpService;
import meghana.model.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SignUpServiceImpl implements SignUpService {
     
	@Autowired
    private  SignUpDao customerDAO;
 
    public void setPersonDAO(SignUpDao productDAO) {
        this.customerDAO = productDAO;
    }
 
   
   
    public void addCustomer(SignUpForm p) {
        this.customerDAO.addCustomer(p);
    }

public SignUpForm getCustomerByUsername(String username) {
	return this.customerDAO.getCustomerByUsername(username);
}

   
}
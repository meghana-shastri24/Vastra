package meghana.Dao;

import meghana.model.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SignUpDaoService {
     
	@Autowired
    private  SignUpDaoImpl customerDAO;
 
    public void setPersonDAO(SignUpDaoImpl productDAO) {
        this.customerDAO = productDAO;
    }
 
   
   
    public void addCustomer(SignUpForm p) {
        this.customerDAO.addCustomer(p);
    }

public SignUpForm getCustomerByUsername(String username) {
	return this.customerDAO.getCustomerByUsername(username);
}

/*
 @Transactional
public String getcustbyemail(String parameter) {
	return this.customerDAO.getcustbyemail("parameter");
}
*/
   
   
}
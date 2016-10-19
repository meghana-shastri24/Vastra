package meghana.Dao;

import meghana.model.*;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SignUpDaoService {
     
	@Autowired
    private  SignUpDaoImpl customerDAO;
 
    public void setPersonDAO(SignUpDaoImpl productDAO) {
        this.customerDAO = productDAO;
    }
 
   
   @Transactional
    public void addCustomer(SignUpForm p) {
        this.customerDAO.addCustomer(p);
    }

}
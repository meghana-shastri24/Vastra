package meghana.Dao;

	import org.hibernate.Session;



import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import meghana.model.Authorities;
import meghana.model.LoginForm;
import meghana.model.SignUpForm;

	@Repository
	public class SignUpDaoImpl  {

		
		    private static final Logger logger = LoggerFactory.getLogger(SignUpDaoImpl.class);
		 
		    @Autowired
		    private SessionFactory sessionFactory;
		     
		    public void setSessionFactory(SessionFactory sf){
		        this.sessionFactory = sf;
		    }
		 
		  
		    public void addCustomer(SignUpForm p)
		    {
		        Session session = this.sessionFactory.getCurrentSession();
		        session.persist(p);
		        

		        LoginForm l = new LoginForm();
		        l.setEmail(p.getEmail());
		        l.setPassword(p.getPassword());
		        l.setId(p.getId());
		        session.persist(l);

		        
		        Authorities at = new Authorities();
		        at.setUsername(p.getEmail());
		        at.setAuthority("ROLE_USER");
		        at.setId(p.getId());
		        session.saveOrUpdate(at);

		        logger.info("Customer saved successfully, Customer Details="+p);
		    }


}

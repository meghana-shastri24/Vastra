package meghana.Dao.impl;



import org.hibernate.Query;
import org.hibernate.Session;



import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import meghana.Dao.SignUpDao;
import meghana.model.Authorities;
import meghana.model.BillingAddress;
import meghana.model.Cart;
import meghana.model.LoginForm;

import meghana.model.SignUpForm;

	@Repository
	@Transactional
	public class SignUpDaoImpl implements SignUpDao  {

		
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
		        p.setLogin(l);
		        l.setSignup(p);
		        l.setEmail(p.getEmail());
		        l.setPassword(p.getPassword());
		        session.persist(l);
		        
		        Authorities at = new Authorities();
		        at.setCid(p.getId());
		        at.setUsername(p.getEmail());
		        at.setAuthority("ROLE_USER");
		        
		        
		        session.persist(at);
		        
		        
		       BillingAddress b=new BillingAddress();
		       p.setBad(b);
		       b.setSignup(p);
		       b.setBaddress(p.getAddress());
		       session.persist(b);
		       
		       Cart c=new Cart();
		       
		       c.setSignup(p);
		       p.setCart(c);
		       session.persist(c);
		       
		       
		        logger.info("Customer saved successfully, Customer Details="+p);
		    }


			public SignUpForm getCustomerByUsername(String username) {
				
				Session session = sessionFactory.getCurrentSession();
		        Query query = session.createQuery("from SignUpForm where email = ?");
		        query.setString(0, username);

		        return (SignUpForm) query.uniqueResult();
			}


	}
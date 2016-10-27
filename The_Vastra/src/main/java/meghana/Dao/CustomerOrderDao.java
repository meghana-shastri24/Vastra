package meghana.Dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class CustomerOrderDao {

	        @Autowired
	        private SessionFactory sessionFactory;

	        
	

	public void addCustomerOrder(CustomerOrderDao customerOrder) {
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customerOrder);
        session.flush();		
	}

	

	
	}	
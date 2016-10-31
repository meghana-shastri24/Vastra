package meghana.Dao.impl;


import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import meghana.Dao.CustomerOrderDao;
import meghana.model.CustomerOrder;



@Repository
@Transactional
public class CustomerOrderDaoimpl implements CustomerOrderDao {

	        @Autowired
	        private SessionFactory sessionFactory;

	        
	

	public void addCustomerOrder(CustomerOrder customerOrder) {
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customerOrder);
        session.flush();		
	}

	

	
	}	

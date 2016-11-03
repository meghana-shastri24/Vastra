package meghana.Dao.impl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import meghana.Dao.CustomerOrderDao;
import meghana.model.Cart;
import meghana.model.CustomerOrder;
import meghana.model.FinalOrder;
import meghana.model.SignUpForm;



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

	
	public List<CustomerOrder> getOrderByCartId(int cartid){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from CustomerOrder where cartid = ?");
        query.setInteger(0, cartid);
        List<CustomerOrder> cartitem= query.list();
        session.flush();
        return cartitem;
 	
 	}
	public void deleteOrder(CustomerOrder order){
		Session session = sessionFactory.getCurrentSession();
        session.delete(order);
        session.flush();
	}
    public void removeAllOrder(Cart cart) {
		Session session = sessionFactory.getCurrentSession();
		int cartid=cart.getCartid();
		Query query = session.createQuery("from CustomerOrder where cartid = ?");
        query.setInteger(0, cartid);
	
		List<CustomerOrder> orde = query.list();
        System.out.println("4");
        for (CustomerOrder ord : orde) {
    	    FinalOrder order = new FinalOrder();    		 

        	 SignUpForm customer = cart.getSignup();
 	        order.setCustomername(customer.getUsername());
 	        order.setDeliveryadrress(customer.getAddress());

 	        	order.setPid(ord.getPid());
 	        	order.setBrand(ord.getBrand());
 	        	order.setQuant(ord.getQuant());
 	        	order.setPrice(ord.getPrice());
 	        	 
 	        	addfinalorder(order);
        	removeOrderItem(ord);
        }
     
    }
    public void removeOrderItem (CustomerOrder order) {
    Session session = sessionFactory.getCurrentSession();
    session.delete(order);
    session.flush();
}
	public void addfinalorder(FinalOrder order){
		Session session = sessionFactory.getCurrentSession();
        session.save(order);
        session.flush();
	}

}

 package meghana.Dao.impl;

import java.io.IOException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import meghana.Dao.CartDao;
import meghana.Service.impl.customerorderserviceimpl;
import meghana.model.Cart;
import meghana.model.CartItems;

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

	@Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private customerorderserviceimpl customerorderservice;

    public Cart getCartById (int cartId) {
        Session session = sessionFactory.getCurrentSession();
        return (Cart) session.get(Cart.class, cartId);
    }

    public void update(Cart cart) {
        int cartid = cart.getCartid();
        double grandTotal = customerorderservice.getCustomerOrderGrandTotal(cartid);
        cart.setGrandtotal(grandTotal);

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cart);
    }

    public Cart validate(int cartid) throws IOException {
    	System.out.println("hiiiiii");
        Cart cart=getCartById(cartid);
        if(cart==null||cart.getCartitems().size()==0) {
            throw new IOException(cartid+"");
        }
        update(cart);
        return cart;
    }
    
	public List<CartItems> getCartItemByCartId(int cartid)
	{
		 Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery("from CartItems where cartid = ?");
	        query.setInteger(0, cartid);
	        List<CartItems> cartitem= query.list();
	        session.flush();
	        return cartitem;
		
	}


}

package meghana.Dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import meghana.model.Cart;
import meghana.model.CartItems;


@Repository
@Transactional
public class CartitemDao {


	@Autowired
    private SessionFactory sessionFactory;

    public void addCartItem(CartItems cartItem) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cartItem);
        session.flush();
    }

	public CartItems getCartItemByCiId(int cartitemid) {
		 Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery("from CartItems where cartitemid = ?");
	        query.setInteger(0, cartitemid);
	        session.flush();

	        return (CartItems) query.uniqueResult();
	}

	public void removeCartItem(CartItems cartitem) 
	{		
		Session session = sessionFactory.getCurrentSession();
		session.delete(cartitem);
        System.out.println("Exception : " + cartitem);
        session.flush();		
	}

	public void removeallcartitems(Cart cart) 
	{
		List<CartItems> cartItems = cart.getCartitems();

        for (CartItems item : cartItems) {
            removeCartItem(item);
        }		
	}

}

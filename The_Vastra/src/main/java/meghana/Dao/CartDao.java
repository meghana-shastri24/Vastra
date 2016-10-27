package meghana.Dao;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import meghana.model.Cart;

@Repository
@Transactional
public class CartDao {

	@Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private customerorderservice customerorderservice;

    public Cart getCartById (int cartId) {
        Session session = sessionFactory.getCurrentSession();
        return (Cart) session.get(Cart.class, cartId);
    }

    public void update(Cart cart) {
        int cartId = cart.getCartid();
        double grandTotal = customerorderservice.getCustomerOrderGrandTotal(cartId);
        cart.setGrandtotal(grandTotal);

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cart);
    }

    public Cart validate(int cartId) throws IOException {
        Cart cart=getCartById(cartId);
        if(cart==null||cart.getCartitems().size()==0) {
            throw new IOException(cartId+"");
        }
        update(cart);
        return cart;
    }

}

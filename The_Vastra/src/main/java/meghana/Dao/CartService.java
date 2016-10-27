package meghana.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meghana.model.Cart;

@Service
public class CartService {

	@Autowired
	 public CartDao cartdao;
	 
	 
	public Cart getCartById(int cartId) {
        return cartdao.getCartById(cartId);
	}

	 public void update(Cart cart) {
	        cartdao.update(cart);
	    }
}

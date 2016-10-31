package meghana.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meghana.Dao.CartDao;
import meghana.Service.CartService;
import meghana.model.Cart;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	 public CartDao cartdao;
	 
	 
	public Cart getCartById(int cartid) {
        return cartdao.getCartById(cartid);
	}

	 public void update(Cart cart) {
	        cartdao.update(cart);
	    }
}

package meghana.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meghana.Dao.CartDao;
import meghana.Service.CartService;
import meghana.model.Cart;
import meghana.model.CartItems;

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
	 
		public List<CartItems> getCartItemByCartId(int cartid)
		{
			return cartdao.getCartItemByCartId(cartid);
		}

}

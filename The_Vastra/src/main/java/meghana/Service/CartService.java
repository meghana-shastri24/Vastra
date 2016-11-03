package meghana.Service;

import java.util.List;

import meghana.model.Cart;
import meghana.model.CartItems;

public interface CartService {

	
	public Cart getCartById(int cartId);
	
	 public void update(Cart cart);

	public List<CartItems> getCartItemByCartId(int cartid);
}

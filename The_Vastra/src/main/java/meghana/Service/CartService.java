package meghana.Service;

import meghana.model.Cart;

public interface CartService {

	
	public Cart getCartById(int cartId);
	
	 public void update(Cart cart);
}

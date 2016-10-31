package meghana.Service;

import meghana.model.Cart;
import meghana.model.CartItems;

public interface CartItemService {
	
	public void addCartItem(CartItems cartItem);
	
	public CartItems getCartItemByCiId(int productId);
	
	public void removeCartItem(CartItems cartItem);
	
	public void removeAllCartItems(Cart cart);

}

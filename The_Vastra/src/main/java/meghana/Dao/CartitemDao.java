package meghana.Dao;

import meghana.model.Cart;
import meghana.model.CartItems;

public interface CartItemDao {

	public void addCartItem(CartItems cartItem) ;
	
	public CartItems getCartItemByCiId(int cartitemid);
	
	public void removeCartItem(CartItems cartitem) ;
	
	public void removeallcartitems(Cart cart) ;
}

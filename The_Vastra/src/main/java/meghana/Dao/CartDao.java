package meghana.Dao;

import java.io.IOException;
import java.util.List;

import meghana.model.Cart;
import meghana.model.CartItems;

public interface CartDao {
	
	 public Cart getCartById (int cartId);
	 
	 public void update(Cart cart);
	 
	 public Cart validate(int cartid) throws IOException;

	public List<CartItems> getCartItemByCartId(int cartid);

}

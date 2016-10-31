package meghana.Dao;

import java.io.IOException;

import meghana.model.Cart;

public interface CartDao {
	
	 public Cart getCartById (int cartId);
	 
	 public void update(Cart cart);
	 
	 public Cart validate(int cartid) throws IOException;

}

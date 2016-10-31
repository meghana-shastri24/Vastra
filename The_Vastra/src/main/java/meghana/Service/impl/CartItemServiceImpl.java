package meghana.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import meghana.Dao.CartItemDao;
import meghana.Service.CartItemService;
import meghana.model.Cart;
import meghana.model.CartItems;



@Service
public class CartItemServiceImpl implements CartItemService {
	
	@Autowired
	private CartItemDao cartitemdao;

	@Transactional
	public void addCartItem(CartItems cartItem) {

		this.cartitemdao.addCartItem(cartItem);
	}

	public CartItems getCartItemByCiId(int productId) {
		return this.cartitemdao.getCartItemByCiId(productId);
	}

	public void removeCartItem(CartItems cartItem) {
		this.cartitemdao.removeCartItem(cartItem);
	}

	public void removeAllCartItems(Cart cart) {
		this.cartitemdao.removeallcartitems(cart);
	}

}

package meghana.Dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meghana.model.Cart;
import meghana.model.CartItems;


@Service
public class customerorderservice {

	@Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrderDao customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }


    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal=0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItems> cartItems = cart.getCartitems();

        for (CartItems item : cartItems) {
            grandTotal+=item.getTotalprice();
        }

        return grandTotal;
    }
}

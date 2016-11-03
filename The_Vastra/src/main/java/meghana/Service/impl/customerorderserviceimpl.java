package meghana.Service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meghana.Dao.CustomerOrderDao;
import meghana.Service.CartService;
import meghana.Service.CustomerOrderService;
import meghana.model.Cart;
import meghana.model.CartItems;
import meghana.model.CustomerOrder;


@Service
public class customerorderserviceimpl implements CustomerOrderService {

	@Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder) {
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
    
    public List<CustomerOrder> getOrderByCartId(int cartid)
    {
    	
    	return customerOrderDao.getOrderByCartId(cartid);
    }

	public void deleteOrder(CustomerOrder order)
	{
		
		customerOrderDao.deleteOrder(order);
	}
}

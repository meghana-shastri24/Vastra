package meghana.controller;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import meghana.Service.CartService;
import meghana.Service.CustomerOrderService;
import meghana.model.Cart;
import meghana.model.CustomerOrder;
import meghana.model.SignUpForm;



@Controller
public class OrderController {
	
	 @Autowired
	    private CartService cartService;

	    @Autowired
	    private CustomerOrderService customerOrderService;

	    @RequestMapping("/order/{cartid}")
	    public String createOrder(@PathVariable("cartid") int cartid) {
	        CustomerOrder customerOrder = new CustomerOrder();
	        Cart cart=cartService.getCartById(cartid);
	        customerOrder.setCart(cart);

	        SignUpForm customer = cart.getSignup();
	        customerOrder.setCustomer(customer);
	        customerOrder.setBillingAddress(customer.getBad());

	        customerOrderService.addCustomerOrder(customerOrder);
	        
	        System.out.println("in ordercontroller");
	        
	        
	        return "redirect:/checkout?cartid="+cartid;
	    }

}

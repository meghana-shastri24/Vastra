package meghana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import meghana.Service.CartService;
import meghana.Service.CustomerOrderService;
import meghana.Service.ProductService;
import meghana.model.Cart;
import meghana.model.CartItems;
import meghana.model.CustomerOrder;
import meghana.model.ProductForm;
import meghana.model.SignUpForm;



@Controller
public class OrderController {
	
	 @Autowired
	    private CartService cartService;

	    @Autowired
	    private CustomerOrderService os;
	    
	    @Autowired
	    private ProductService ps;

	    @RequestMapping("/order/{cartid}")
	    public String createOrder(@PathVariable("cartid") final int cartid) {
	    	
	    	
	    	Thread thread1 = new Thread() {
	    		
	    	    public void run() {
	    	    	
	    	    	try{
	    	    		
	    	    		System.out.println("thread2 running");

	    	    		System.out.println("thread sleep");

	    	    		Thread.sleep(30000);
	    	    	}
	    	    	
	    	    	catch(Exception e){}
	    	    	
	    	        timeellapse(cartid);
    	    		System.out.println("time ellapsed");

	    	        
	    	    }
	    	    	
	    	};

	    	Thread thread2 = new Thread() {
	    	    public void run() {
	    	    	
    	    		System.out.println("thread2 running");

	    	    	 CustomerOrder order = new CustomerOrder();
	    	         List<CartItems> items=cartService.getCartItemByCartId(cartid);
	    	    	 for(CartItems item:items){
	    	      	   
	    	    	        Cart cart=cartService.getCartById(cartid);
	    	    	        order.setCart(cart);
	    	    	        
	    	    	   SignUpForm customer = cart.getSignup();
	    	    	        order.setCustomer(customer);
	    	    	        order.setCustomername(customer.getUsername());
	    	    	        order.setDeliveryadrress(customer.getAddress());
	    	    	        order.setBillingAddress(customer.getBad());
	    	    	        
	    	    	        	ProductForm p = ps.getProductsbyId(item.getProduct().getProductid());
	    	    	        	order.setPid(p.getProductid());
	    	    	        	order.setBrand(p.getBrand());
	    	    	        	order.setPrice(p.getPrice());
	    	    	        	order.setQuant(item.getQuantity());
	    	    	        	p.setStock(p.getStock()-item.getQuantity());
	    	    	        	System.out.println(p.getStock()-item.getQuantity());
	    	    	        	ps.editProduct(p);
	    	    	        	
	    	    	        	os.addCustomerOrder(order);
	    	    	        	order.setCustomerOrderId(order.getCustomerorderid()+1);

	    	    	        }
	    	    }
	    	};
	       
	      thread1.start();
	      thread2.start();

	        

	        return "redirect:/checkout?cartid="+cartid;
	    }

		public void timeellapse(int cartid) {
			List<CustomerOrder> orders=os.getOrderByCartId(cartid);
	        for(CustomerOrder order:orders){
	        	ProductForm p = ps.getProductsbyId(order.getPid());
	        	p.setStock(p.getStock()+order.getQuant());
	        	System.out.println(p.getStock()+order.getQuant());

	        	ps.editProduct(p);
	        	os.deleteOrder(order);
			
		}}

	

}

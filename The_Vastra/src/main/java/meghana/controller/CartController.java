package meghana.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import meghana.Service.CartItemService;
import meghana.Service.CartService;
import meghana.Service.ProductService;
import meghana.Service.SignUpService;
import meghana.model.Cart;
import meghana.model.CartItems;
import meghana.model.ProductForm;
import meghana.model.SignUpForm;


@Controller
@RequestMapping("/cart")
public class CartController {

	 @Autowired
	    private CartService cartService;

	    @Autowired
	    private CartItemService cartItemService;

	    @Autowired
	    private SignUpService customerService;

	    @Autowired
	    private ProductService productService;

	    @RequestMapping("/{cartid}")
	    public @ResponseBody
	    Cart getCartById (@PathVariable(value = "cartid") int cartId) {
	        return cartService.getCartById(cartId);
	    }

	    @RequestMapping(value = "/add1/{productid}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void addItem (@PathVariable(value ="productid") int productId) {
	    System.out.println("Hello Before Cart Add");
	    	try{
	    		User user= (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    	System.out.println(1);
	        SignUpForm customer = customerService.getCustomerByUsername(user.getUsername());
	        System.out.println(1);
	        Cart cart = customer.getCart();
	        System.out.println(2);
	        ProductForm product = productService.getProductsbyId(productId);
	        System.out.println("Product Id : " + product.getProductid());
	        System.out.println(3);
	        List<CartItems> cartItems = cart.getCartitems();
	        System.out.println(4+""+ cartItems.size());

	        for (int i=0; i<cartItems.size(); i++) {
	        	System.out.println(5);
	            if(product.getProductid()==cartItems.get(i).getProduct().getProductid()){
	            	System.out.println(6);
	                CartItems cartItem = cartItems.get(i);
	                cartItem.setQuantity(cartItem.getQuantity()+1);
	                cartItem.setTotalprice(product.getPrice()*cartItem.getQuantity());
	                cartItemService.addCartItem(cartItem);
	                System.out.println(7);
	                return;
	            }
	        }

	        CartItems cartItem = new CartItems();
	        cartItem.setProduct(product);
	        cartItem.setQuantity(1);
	        cartItem.setTotalprice(product.getPrice()*cartItem.getQuantity());
	        cartItem.setCart(cart);
	        cartItemService.addCartItem(cartItem);
	    }catch(Exception ex)
	    {
	    	System.out.println("Exception : " + ex.getMessage());
	    }
	    }

	    @RequestMapping(value = "/remove/{cartitemid}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void removeItem (@PathVariable(value = "cartitemid") int cartitemid) {
	        CartItems cartItem = cartItemService.getCartItemByCiId(cartitemid);
	        cartItemService.removeCartItem(cartItem);

	    }

	    @RequestMapping(value = "/clear/{cartid}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void clearCart(@PathVariable(value = "cartid") int cartid) {
	        Cart cart = cartService.getCartById(cartid);
	        cartItemService.removeAllCartItems(cart);
	    }

	    @ExceptionHandler(IllegalArgumentException.class)
	    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, please verify your payload.")
	    public void handleClientErrors (Exception e) {}

	    @ExceptionHandler(Exception.class)
	    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error.")
	    public void handleServerErrors (Exception e) {}
	}



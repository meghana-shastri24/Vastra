package meghana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import meghana.Dao.SignUpDaoService;
import meghana.model.SignUpForm;


@Controller
@RequestMapping("/customer/viewcart")
public class CartCont {
	
	
	    @Autowired
	    private SignUpDaoService customerService;

	    @RequestMapping
	    public String getCart(){
	    	
	    	System.out.println("in get cart");
    		User user= (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

	        SignUpForm customer = customerService.getCustomerByUsername (user.getUsername());
	        int cartId = customer.getCart().getCartid();
	        System.out.println("View Cart in Get Cart"+cartId);
	        return "redirect:/customer/viewcart/"+cartId;
	    }

	    @RequestMapping("/{cartid}")
	    public String getCartRedirect(@PathVariable (value = "cartid") int cartId, Model model) {
	        model.addAttribute("cartid", cartId);
	        System.out.println("View Cart in Get Cart Redirect");
	        return "viewcart";
	    }

}

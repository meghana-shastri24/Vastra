package meghana.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import meghana.Service.SignUpService;
import meghana.model.SignUpForm;


@Controller
public class CartCont {
	
	
	    @Autowired
	    private SignUpService customerService;

	    @RequestMapping("/viewcart")
	    public String getCart(){
	    	
	    	System.out.println("in get cart");
    		User user= (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

	        SignUpForm customer = customerService.getCustomerByUsername (user.getUsername());
	        int cartId = customer.getCart().getCartid();
	        System.out.println("View Cart in Get Cart"+cartId);
	        return "redirect:/cart?param="+cartId;
	    }

	    @RequestMapping(value="/cart")
	    public String getCartRedirect( Model model,HttpServletRequest request) {
	    	int cartid=Integer.parseInt(request.getParameter("param"));
	    	User u=(User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	    	SignUpForm user=customerService.getCustomerByUsername(u.getUsername());
	    	if(user.getCart().getCartid()==cartid){
	    		model.addAttribute("cartid", cartid);
		        System.out.println("View Cart in Get Cart Redirect");
	    		}
	    	
	    	
	        return "viewcart";
	    }

}

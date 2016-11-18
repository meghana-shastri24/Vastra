package meghana.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import meghana.Service.ProductService;
import meghana.model.ProductForm;





@Controller
public class HomeController
{
	
	@Autowired
	ProductService productservice;
	
	
    @RequestMapping("/")
    public String index()
    { 
    	
    	
        return "index";
    }
   
   

    
    @RequestMapping("/login")
    public String login(@RequestParam(value="error", required = false) String error, @RequestParam(value="logout",
            required = false) String logout, Model model) {
        if (error!=null) {
            model.addAttribute("error", "Invalid username and password");
        }
        

        if(logout!=null) {
            model.addAttribute("msg", "You have been logged out successfully.");
        }

        return "login";
    }


    
    
}


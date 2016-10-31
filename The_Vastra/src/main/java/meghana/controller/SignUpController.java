package meghana.controller;

import javax.validation.Valid;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import meghana.Dao.SignUpDao;
import meghana.model.SignUpForm;

@Controller
public class SignUpController {
	
	@Autowired
	SignUpDao signupdaoservice;
	
	@Qualifier(value="signupdaoservice")
	public void setSignUpDaoService(SignUpDao ps)
	{
	this.signupdaoservice=ps;
	}

	@RequestMapping(value="/SignUp", method=RequestMethod.GET)
    public String signup(Model model) {
    	model.addAttribute("signupform", new SignUpForm());
    	return "SignUp";
    }
    
    
    
   @RequestMapping(value="/SignUp", method=RequestMethod.POST)
    public String signupsucces(@Valid @ModelAttribute("signupform") SignUpForm signupform, BindingResult result) {
    	if(result.hasErrors())
    	{
    		return "SignUp";
    	}
    	else
    	{
    		
         signupdaoservice.addCustomer(signupform) ;
         return "redirect:/login";

    	}
    	
    	
    	
    }
}

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
import meghana.Service.SignUpService;
import meghana.model.SignUpForm;

@Controller
public class SignUpController {
	
	@Autowired
	SignUpService signupservice;
	
	@Qualifier(value="signupdaoservice")
	public void setSignUpDaoService(SignUpService ps)
	{
	this.signupservice=ps;
	}

	@RequestMapping(value="/SignUp", method=RequestMethod.GET)
    public String signup(Model model) {
    	model.addAttribute("signupform", new SignUpForm());
    	return "SignUp";
    }
    
    
    
   @RequestMapping(value="/SignUpSuccess", method=RequestMethod.POST)
    public String signupsucces(@Valid @ModelAttribute("signupform") SignUpForm signupform, BindingResult result, Model model) {
    	if(result.hasErrors())
    	{
    		System.out.println("error");
    		return "SignUp";
    	}
    	else
    	{
    		
    		
    		String email=signupservice.getemail(signupform.getEmail());
    		if (email==null)
    		{
         signupservice.addCustomer(signupform) ;

         return "redirect:/login";
    		}
    		
    		else
    		{
    			model.addAttribute("msg", "Email already Exists. Please login to continue");
    			return "SignUp";
    		}
    	}
    	
    	
    	
    }
}

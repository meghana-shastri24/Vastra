package meghana.controller;
import meghana.Dao.SignUpDaoService;

import meghana.model.LoginForm;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class HomeController
{
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


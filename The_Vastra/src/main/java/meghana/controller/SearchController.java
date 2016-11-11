package meghana.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import meghana.Service.SearchService;
import meghana.model.ProductForm;

@Controller
public class SearchController {
	
	@Autowired
	SearchService searchservice;
	
	
	@RequestMapping(value="/prosearch")
	
	public String search(Model model, HttpServletRequest req)
	{
		String val=req.getParameter("srch");
		
	
	List<ProductForm> products=searchservice.search(val);
	model.addAttribute("prod", products);
	return "DisplayProducts";
	}
}

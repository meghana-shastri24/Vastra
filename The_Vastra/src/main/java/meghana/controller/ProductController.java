package meghana.controller;


import java.io.BufferedOutputStream;




import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import meghana.Service.ProductService;
import meghana.model.ProductForm;


	@Controller
	public class ProductController {
		private Path path;
		
		@Autowired
		ProductService productservice;
		
		@Qualifier(value="productservice")
		public void setProductService(ProductService ps)
		{
		this.productservice=ps;
		}

		@RequestMapping(value="/AddProducts", method=RequestMethod.GET)
	    public String a(Model model) {
	    	model.addAttribute("addproduct", new ProductForm());
	    	return "AddProducts";
	    }
	    
	    
	    
	   @RequestMapping(value="/AddProducts", method=RequestMethod.POST)
	    public String productsucces( @ModelAttribute("addproduct") ProductForm productform, BindingResult result, HttpServletRequest request) {
	    	
	    		
	         this.productservice.AddProduct(productform) ;
	         String filename = null;
	 		byte[] bytes;
	 		if (!productform.getProfilePicture().isEmpty()) {

	 			try {
	 				
	 				bytes = productform.getProfilePicture().getBytes();
	 				System.out.println("Data Inserted");
	 				String path = request.getSession().getServletContext().getRealPath("/WEB-INF/resources/images/" + productform.getProductid() + ".jpg");
	 				System.out.println("Path = " + path);
	 				System.out.println("File name = " + productform.getProfilePicture().getOriginalFilename());
	 				File f = new File(path);
	 				BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(f));
	 				bs.write(bytes);
	 				bs.close();
	 				System.out.println("Image uploaded");
	 			} catch (Exception ex) {
	 				System.out.println(ex.getMessage());
	 			}
	 		}

	         return "redirect:/allproducts";

	    	}
	    	
	   
	    	
	    	
	   
	   @RequestMapping(value="/productlist", method=RequestMethod.GET)
		public String view(Model model, HttpServletRequest request)
		{
		   String category=request.getParameter("param");
			List<ProductForm> pro= productservice.getAllProducts(category);
			model.addAttribute("prod", pro);
			return "DisplayProducts";
		}
	   
	   @RequestMapping(value="/allproducts", method=RequestMethod.GET)
		public String allproducts(Model model, HttpServletRequest request)
		{
			List<ProductForm> pro= productservice.getAll();
			model.addAttribute("prod", pro);
			return "DisplayProducts";
		}
	    	
	    	
	   
	   
	   @RequestMapping(value="/viewproduct/{productid}",method=RequestMethod.GET)
	    public String viewproduct(@PathVariable int productid, Model model)
	    {
			ProductForm prod=productservice.getProductsbyId(productid);
			model.addAttribute("p", prod);
			return "viewproduct";
		   
	    }
	
	
	@RequestMapping(value="/editproduct/{productid}", method=RequestMethod.GET)
	public String editproduct(@PathVariable ("productid") int productid,  Model model)
	{
		ProductForm pro=productservice.getProductsbyId(productid);
		model.addAttribute("product", pro);
		return "editproduct";
		
	}
	
	@RequestMapping(value="/editproduct/editproduct/{productid}", method = RequestMethod.POST)
	public String editproduct(@ModelAttribute("product") ProductForm productform, BindingResult result, HttpServletRequest request)
	{	
		
		MultipartFile productimage=productform.getProfilePicture();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\"+productform.getProductid()+".jpg");

        if (productimage != null && !productimage.isEmpty()) {
            try {
                productimage.transferTo(new File(path.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Product image saving failed.", e);
            }
        }

        productservice.editProduct(productform);

		
		return "redirect:/allproducts";
	}
	
	@RequestMapping(value="/deleteproduct/{productid}", method=RequestMethod.GET)
	public String deleteproduct(@PathVariable int productid, Model model, HttpServletRequest request)
	{
		
		
		ProductForm productform=productservice.getProductsbyId(productid);
		productservice.deleteproduct(productform);
		
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + productid + ".jpg");
		
		if(Files.exists(path))
			
			try
		{
				Files.delete(path);
		}
		catch (IOException e) {
            e.printStackTrace();
		}
		
		return "redirect:/allproducts";
	}
	}
	
		
		
		
		
		
	


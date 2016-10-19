package meghana.Dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import meghana.model.ProductForm;

	@Service
	public class ProductDaoService {
	     
		@Autowired
	    private  ProductDaoImpl productDAO;
	 
	    public void setProductDAO(ProductDaoImpl ProductDAO) {
	        this.productDAO = ProductDAO;
	    }
	 
	   
	   @Transactional
	    public void AddProduct(ProductForm p) {
	        this.productDAO.addproduct(p);
	    }

	   @Transactional
	   public List<ProductForm> getAllProducts(String category)
	   {
		   return this.productDAO.getproductlist(category);
	   }

@Transactional
	public ProductForm getProductsbyId(int productid) {
		return (ProductForm) this.productDAO.getproductsbyid(productid);
	}

@Transactional
public void editProduct(ProductForm productform) {

	this.productDAO.editproduct(productform); 
}

@Transactional
public void deleteproduct(ProductForm productform) {
this.productDAO.deleteproduct(productform);	
}

@Transactional

public List<ProductForm> getAll() {
	return this.productDAO.getAll();
}





	
}


	   
	


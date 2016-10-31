package meghana.Dao;

import java.util.List;

import meghana.model.ProductForm;

public interface ProductDao {

	
    public void addproduct(ProductForm p);
    
	public List<ProductForm> getproductlist(String category) ;
	
	public ProductForm getproductsbyid(int productid) ;
	
	public void editproduct(ProductForm productform) ;
	
	public void deleteproduct(ProductForm productform) ;
	
	public List<ProductForm> getAll() ;
}

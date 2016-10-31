package meghana.Service;

import java.util.List;

import meghana.Dao.impl.ProductDaoImpl;
import meghana.model.ProductForm;

public interface ProductService {

    public void setProductDAO(ProductDaoImpl ProductDAO);
    
    public void AddProduct(ProductForm p);
    
	   public List<ProductForm> getAllProducts(String category);
	   
		public ProductForm getProductsbyId(int productid);
		
		public void editProduct(ProductForm productform);
		
		public void deleteproduct(ProductForm productform);
		
		public List<ProductForm> getAll();


}

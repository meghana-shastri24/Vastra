package meghana.Dao;

import java.util.List;

import meghana.model.ProductForm;

public interface SearchDao {

	List<ProductForm> search(String val);
	

}

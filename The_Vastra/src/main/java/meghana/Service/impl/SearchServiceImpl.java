package meghana.Service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import meghana.Dao.SearchDao;
import meghana.Service.SearchService;
import meghana.model.ProductForm;


@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	private SearchDao searchdao;

	public List<ProductForm> search(String val)
	{
		System.out.println(val);
		return this.searchdao.search(val);
	}

}

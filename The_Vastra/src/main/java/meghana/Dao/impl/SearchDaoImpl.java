package meghana.Dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import meghana.Dao.SearchDao;
import meghana.model.ProductForm;

@Repository
@Transactional
public class SearchDaoImpl implements SearchDao {
	
	@Autowired
	SessionFactory sf;
	
	
	public List<ProductForm> search(String val)
	{
		Session s=sf.getCurrentSession();
		
		if(val.length()>=3)
		{
			System.out.println(val.length());
			Query query = s.createQuery("from ProductForm where lower(productname) = lower(:all) or lower(brand) = lower(:all) or lower(category) = lower(:all)");
        	query.setParameter("all", val);
        	List<ProductForm> all = query.list();
		
		
		if(!(all.size()>0))
		{
			String a=val.substring(0,3);
    		Query q = s.createQuery("from ProductForm where lower(productname) like lower(:al) or lower(brand) like lower(:al) or lower(category) like lower(:al)");
        	q.setParameter("al", "%"+a+"%");
        	List<ProductForm> all1 = q.list();
        	return all1;
		}
		
		
		else
		{
			return all;
		}
		}
		else
		{
			return null;
		}
	}


}

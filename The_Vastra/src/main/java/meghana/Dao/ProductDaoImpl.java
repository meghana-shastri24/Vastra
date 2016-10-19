package meghana.Dao;



import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import meghana.model.ProductForm;

	@Repository
	public class ProductDaoImpl  {

		
		    private static final Logger logger = LoggerFactory.getLogger(ProductDaoImpl.class);
		 
		    @Autowired
		    private SessionFactory sessionFactory;
		     
		    public void setSessionFactory(SessionFactory sf){
		        this.sessionFactory = sf;
		    }
		 
		  
		    public void addproduct(ProductForm p)
		    {
		        Session session = this.sessionFactory.getCurrentSession();
		        session.persist(p);
		        logger.info("Product saved successfully, Product Details="+p);
		    }


			public List<ProductForm> getproductlist(String category) {
				Session session = this.sessionFactory.getCurrentSession();
				Query query=session.createQuery("from ProductForm where category = :category");
				query.setParameter("category",category);
				List<ProductForm> p= query.list();
				session.flush();
				return p;
				
			}


			public ProductForm getproductsbyid(int productid) {
				Session session = sessionFactory.getCurrentSession();
				ProductForm product=(ProductForm) session.get(ProductForm.class, productid);
				session.flush();
				return product;
				
			}


			public void editproduct(ProductForm productform) {
				
				Session session = sessionFactory.getCurrentSession();
		        session.saveOrUpdate(productform);
		        session.flush();
						
			}


			public void deleteproduct(ProductForm productform) {
				Session session=sessionFactory.getCurrentSession();
				session.delete(productform);
				session.flush();
			}


			public List<ProductForm> getAll() {
				Session session=sessionFactory.getCurrentSession();
				Query query=session.createQuery("from ProductForm");
				List<ProductForm> p= query.list();
				session.flush();
				return p;

			}


			


}



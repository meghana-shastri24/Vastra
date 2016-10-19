package meghana.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Products")
public class ProductForm {
	
	
private	String productname;
private	Double price;
private	String color;
private	String size;
private	int stock;
private String brand;
private String category;
	
	public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int productid;
	
	@Transient
	private MultipartFile profilePicture;

		
	public MultipartFile getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(MultipartFile profilePicture) {
		this.profilePicture = profilePicture;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	

}

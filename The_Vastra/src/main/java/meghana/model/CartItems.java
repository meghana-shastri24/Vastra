package meghana.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartItems implements Serializable {
	
    private static final long serialVersionUID = -904360230041854157L;


	@Id
	@GeneratedValue
	private int cartitemid;
	
	private int quantity;
	
	private double totalprice;
	
	@ManyToOne
	@JoinColumn(name="cartid")
	@JsonIgnore
	Cart cart;
	
	@ManyToOne
	@JoinColumn(name="productid")
	ProductForm product;

	public int getCartitemid() {
		return cartitemid;
	}

	public void setCartitemid(int cartitemid) {
		this.cartitemid = cartitemid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public ProductForm getProduct() {
		return product;
	}

	public void setProduct(ProductForm product) {
		this.product = product;
	}
	
	
	
}

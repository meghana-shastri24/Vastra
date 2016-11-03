package meghana.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerorder")
public class CustomerOrder implements Serializable {
	
    private static final long serialVersionUID = 2983360377227484514L;

	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int customerorderid;

		@OneToOne
	    @JoinColumn(name = "cartid")
	    private Cart cart;

	    @OneToOne
	    @JoinColumn(name = "customerid")
	    private SignUpForm customer;

	    @OneToOne
	    @JoinColumn(name = "aid")
	    private BillingAddress billingAddress;
	    
	    int pid;

	    
	    String customername;
	    String deliveryadrress;
	    int quant;
	    
	    Double Price;
	    String Brand;
	    String productname;
	    
	    public SignUpForm getCustomer() {
			return customer;
		}

		public void setCustomer(SignUpForm customer) {
			this.customer = customer;
		}

		public Double getPrice() {
			return Price;
		}

		public void setPrice(Double double1) {
			Price = double1;
		}

		public String getBrand() {
			return Brand;
		}

		public void setBrand(String brand) {
			Brand = brand;
		}

		public String getProductname() {
			return productname;
		}

		public void setProductname(String productname) {
			this.productname = productname;
		}

		public int getQuant() {
			return quant;
		}

		public void setQuant(int quant) {
			this.quant = quant;
		}

	    

	

		public int getPid() {
			return pid;
		}

		public void setPid(int i) {
			this.pid = i;
		}

		public String getDeliveryadrress() {
			return deliveryadrress;
		}

		public void setDeliveryadrress(String deliveryadrress) {
			this.deliveryadrress = deliveryadrress;
		}

		public int getCustomerorderid() {
			return customerorderid;
		}

		public void setCustomerorderid(int customerorderid) {
			this.customerorderid = customerorderid;
		}

		public String getCustomername() {
			return customername;
		}

		public void setCustomername(String customername) {
			this.customername = customername;
		}

		//getters and setters
	    public int getCustomerOrderId() {
			return customerorderid;
		}

		public void setCustomerOrderId(int customerOrderId) {
			this.customerorderid = customerOrderId;
		}

		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}

		

		public BillingAddress getBillingAddress() {
			return billingAddress;
		}

		public void setBillingAddress(BillingAddress billingAddress) {
			this.billingAddress = billingAddress;
		}

	    
}
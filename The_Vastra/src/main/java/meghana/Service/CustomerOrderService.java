package meghana.Service;

import java.util.List;

import meghana.model.CustomerOrder;

public interface CustomerOrderService {
	
    public void addCustomerOrder(CustomerOrder customerOrder);
    
    public double getCustomerOrderGrandTotal(int cartId);

	public List<CustomerOrder> getOrderByCartId(int cartid);

	public void deleteOrder(CustomerOrder order);

}

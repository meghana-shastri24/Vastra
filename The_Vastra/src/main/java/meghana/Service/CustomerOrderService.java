package meghana.Service;

import meghana.model.CustomerOrder;

public interface CustomerOrderService {
	
    public void addCustomerOrder(CustomerOrder customerOrder);
    
    public double getCustomerOrderGrandTotal(int cartId);

}

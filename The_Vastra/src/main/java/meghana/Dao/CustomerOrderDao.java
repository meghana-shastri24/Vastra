package meghana.Dao;

import java.util.List;

import meghana.model.Cart;
import meghana.model.CustomerOrder;

public interface CustomerOrderDao {
	
	public void addCustomerOrder(CustomerOrder customerOrder);

	public List<CustomerOrder> getOrderByCartId(int cartid);

	public void deleteOrder(CustomerOrder order);
    public void removeAllOrder(Cart cart);


}

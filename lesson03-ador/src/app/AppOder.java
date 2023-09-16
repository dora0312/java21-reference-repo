package app;

import java.time.LocalDateTime;

import bean.Customer;
import bean.Item;
import bean.ItemDetailt;
import bean.Order;
import utils.OrderUtils;

public class AppOder {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "243", "California");
		
		Item i1 = new Item("SS10", "Android", "Black", 620);
		Item i2 = new Item("SS20U", "Android", "Green", 840);
		Item i3 = new Item("IP4", "IOS", "White", 280);
		Item i4 = new Item("IP12", "IOS", "Black", 880);
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 560);
			
		
		// Order
		Order order1 = new Order(c1, new ItemDetailt[] {
							new ItemDetailt(i1, 3),
							new ItemDetailt(i4, 2),
							new ItemDetailt(i2, 1) 
						}, LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		Order order2 = new Order(c2, new ItemDetailt[] {
							new ItemDetailt(i3, 2),
							new ItemDetailt(i5, 1),
						}, LocalDateTime.of(2021, 5, 7, 20, 10, 12));
		Order order3 = new Order(c2, new ItemDetailt[] {
							new ItemDetailt(i4, 1),
						}, LocalDateTime.of(2021, 5, 8, 9, 28, 32));

		OrderUtils.export(order1);
		OrderUtils.export(order2);
		OrderUtils.export(order3);
		
	}
}

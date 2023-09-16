package utils;

import java.time.LocalDate;
import java.time.Month;

import bean.Item;
import bean.ItemDetailt;
import bean.Order;

/**
 * Utility of Order class
 * Normally: Utility is place where contains utility methods
 * No care created class's object
 */
public class Utils {
	
	private Utils() {
	}
	
	public static void export(Order order) {
		double totolOfMoney = 0;
		System.out.println("====================Thông tin khách hàng====================");
		System.out.println("Name: " + order.getCustomer().getName());
		System.out.println("Phone: " + order.getCustomer().getPhone());
		System.out.println("Address: " + order.getCustomer().getAddress());
		System.out.print("Thông tin sản phẩm đã mua: ");
		ItemDetailt[] ids = order.getItemDetails();
		for(ItemDetailt id : ids) {
			Item item  = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			System.out.print("\n  Tên sản phẩm: " + item.getId()
							 + " -- Số lượng: " + quantity
							 + " -- Thành tiền: " + idCost);
			boolean isSaleDate = LocalDate.of(2021, Month.MAY, 8).equals(order.getOrderDate().toLocalDate());
			
			if( item.getCost() > 590 && isSaleDate) {
				idCost *= 0.9;
				System.out.print(" Giảm giá 10% còn: " + idCost);
			}
			totolOfMoney += idCost;
		}
		System.out.println("\nTổng hóa đơn: " + totolOfMoney);
		//return totolOfMoney;
	}
}

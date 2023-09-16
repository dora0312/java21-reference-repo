package utils;

import java.time.LocalDate;
import java.time.Month;

import bean.Car;
import bean.HumanInfo;
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
	public static void printHumanInfo(HumanInfo[] humanInfo) {
		double totolTax = 0;
		
		
		System.out.println("Tên chủ xe         Loại xe       Dung tích       Trị giá       Số lượng       Thuế phải nộp");
		System.out.println("=======================================================================================================");
		
		for(HumanInfo info: humanInfo) {
			Car[] cars = info.getCar();
			boolean checkQty = true;
			for(Car car: cars) {
				if(car == null) {
					break;
				}
				if( checkQty ) {
					System.out.print(info.getHuman().getName());
				} else {
					System.out.print("            ");
				}
				System.out.print("       " + car.getCarName());
				System.out.print("           " + car.getCapcity());
				System.out.print("           " + car.getPrice());
				System.out.print("            " + car.getQuantity());
				int capcity = car.getCapcity();
				double price = car.getPrice() * car.getQuantity();
				if( capcity <= 100 ) {
					totolTax += price * 0.1;
				} else if( capcity <= 200 ) {
					totolTax += price * 0.3;
				} else {
					totolTax += price * 0.5;
				}
				System.out.println("                  " + totolTax);
				checkQty = false;
			}
		}
		
		
		
		
	}
}

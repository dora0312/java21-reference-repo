package bai03;

import bai03.bean.Item;
import static model.DataModel.*;
import static utils.ArrayUtils.*;

import java.util.Arrays;
import static java.util.Comparator.*;


public class App03 {
	public static void main(String[] args) {
		Item[] items = mockItems();
		generate("0.Mảng gốc", items);
		generate("Mặt hàng có giá trị cao nhất của mỗi cửa hàng",
				findLargerPriceOfItemStor(items));
	}
	private static Item[] findLargerPriceOfItemStor(Item[] item) {
		Item[] largerPriceOfItemStor = new Item[item.length];
		int count = 0;
		
		sortByStoreAndPrice(item);
		largerPriceOfItemStor[count] = item[count];
		count++;
		
		for(int i = 1; i < item.length; i++) {
			if(largerPriceOfItemStor[count-1].getStoreId() != item[i].getStoreId()) {
				largerPriceOfItemStor[count] = item[i];
				count++;
			}
		}
		return Arrays.copyOf(largerPriceOfItemStor, count);
	}
	
	private static void sortByStoreAndPrice(Item[] items) {
		// Chưa xử lý null
		Arrays.sort(items, 
				comparing(Item::getStoreId, reverseOrder())
				.thenComparing(Item::getPrice, reverseOrder())
		);
	}
}

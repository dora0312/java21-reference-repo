package view.sorting;

import static utils.ArrayUtils.generate;
import static utils.ArrayUtils.swap;

import java.math.BigDecimal;

import bean.Item;
import functional.Compare_Item;
import model.DataModel;
public class Ex03BublleSort_Item {
	public static void main(String[] args) {
		
		Item[] items = DataModel.mockItems_NullValues();
		sort(items, (i1, i2) -> {
			// null first
			if (i1 == null) {
				return -1;
			}
			if (i2 == null) {
				return 1;
			}
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			if (id1 > id2) {
				return 1;
			}
			return -1;
		});
		
		generate("1. Items(sort by id[asc])", items);
		
		sort(items, (i1, i2) -> {
			// null first
			if (i1 == null) {
				return -1;
			}
			if (i2 == null) {
				return 1;
			}
			
			// non-null items
			
			String name1 = i1.getName();
			String name2 = i2.getName();
			
			// null-last for name
			if (name1 == null) {
				return -1;
			}
			if (name2 == null) {
				return 1;
			}
			
			// name[desc]
			if (name1.compareTo(name2) < 0) {
				return 1; // hoán vị
			}
			return -1;
		});
		generate("2. Items(sort by name[desc])", items);
		
		
		sort(items, (i1, i2) -> {
			// null first
			if (i1 == null) {
				return -1;
			}
			if (i2 == null) {
				return 1;
			}
			
			Integer store1 = i1.getStoreId();
			Integer store2 = i2.getStoreId();
			
			// compare by store id --> asc
			int storeIdCompare = store1.compareTo(store2);
			if (storeIdCompare != 0) {
				return storeIdCompare;
			}
			
			// compare by price id --> desc
			BigDecimal price1 = i1.getPrice();
			BigDecimal price2 = i2.getPrice();
			
			return price2.compareTo(price1);
			
		});
		generate("3. Items(sort by store[asc], price[desc])", items);
		
	}
	
	private static void sort(Item[] items, Compare_Item compareItem) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (compareItem.compare(items[j], items[j+1]) > 0) {
					swap(items, j, j+1);
				}
			}
		}
	}
}

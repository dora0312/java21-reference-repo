package view.sorting;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import bean.Item;
import functional.Compare_Item;

import static utils.ArrayUtils.*;
public class Ex03BublleSort_Item {
	public static void main(String[] args) {
		Item[] items = {
			new Item(11, "Item 11", db("22"), 1, dt("16/11/2023 15:12:22")),
			new Item(14, "Item 14", db("77"), 1, dt("18/11/2023 16:12:22")),
			new Item(22, "Item 22", db("66"), 2, dt("22/08/2023 17:12:22")),
			new Item(21, "Item 21", db("18"), 2, dt("05/05/2023 18:12:22")),
			new Item(12, "Item 12", db("99"), 1, dt("24/12/2023 12:12:22")),
			new Item(55, "Item 55", db("55"), 5, dt("17/11/2023 11:12:22")),
		};
		
		generate("1. Trước khi sắp xếp", items);
		// sort tăng dần theo Id
		sort(items, (i1, i2) -> {
			if(i1.getId() > i2.getId()) {
				return 1;
			}
			return -1;
		});
		generate("2. Sau khi sắp xếp theo Id", items);
		
	}
	private static void sort(Item[] items, Compare_Item compare_Item) {
		for(int i = 0; i < items.length; i++) {
			for(int j =0; j < items.length - i - 1; j++) {
				if(compare_Item.compare(items[j], items[j + 1]) > 0) {
					swap(items, j, j + 1);
				}
			}
		}
	}
	
	private static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
	private static BigDecimal db(String value) {
		return new BigDecimal(value);
	}
}

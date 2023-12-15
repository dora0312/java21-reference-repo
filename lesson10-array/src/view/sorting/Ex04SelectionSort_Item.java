package view.sorting;

import bean.Item;
import functional.Compare_Item;
import model.DataModel;
import static utils.ArrayUtils.*;

public class Ex04SelectionSort_Item {

	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		sort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		generate("1. Sort items by id[asc]", items);
	}

	private static void sort(Item[] items, Compare_Item compareItem) {
		for (int i = items.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				// item[j]: phần tử đứng trước
				// item[i]: phần tử đứng sau
				if (compareItem.compare(items[j], items[i]) > 0) {
					swap(items, j, i);
				}
			}
		}
	}

}
package view.sorting;

import bean.Item;

import functional.Compare_Item;
import model.DataModel;
import static utils.ArrayUtils.*;

public class Ex05InsertionSort_Item {

	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		generate("0. Sort before", items);
		sort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		generate("1. Sort items by store[desc]", items);
	}

	private static void sort(Item[] items, Compare_Item compareItem) {
		for (int i = 1; i < items.length; i++) {
			Item temp = items[i]; // round
			int j = i - 1;
			// shift right
			while(j >= 0 && compareItem.compare(items[j], items[j + 1]) > 0) {
				Item temp2 = items[j + 1];
				items[j+1] = items[j];
				items[j] = temp2;
				j--;
			}
			//items[j+1] = temp;
		}
	}

}
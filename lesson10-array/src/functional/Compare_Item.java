package functional;

import bean.Item;

@FunctionalInterface
public interface Compare_Item {
	int compare(Item i1, Item i2);
}

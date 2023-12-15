package view.sorting.available.method;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;

import static utils.ArrayUtils.*;

public class Ex02QuickSort_Item {
	
	public static void main(String[] args) {
		
		// non-null elements
		Item[] items = DataModel.mockItems();
		
		// sort array of objects[Integer, Double, Item ...]
		
		/*
		 Cách 1: Arrays.sort(Object[] a);
		 + Lúc compile a là mảng kiểu Object 
		 	--> lúc runtime có thể nhận vào bất kỳ KDL đối tượng nào
		 + Để biết được mảng a sắp xếp tăng dần, giảm dần theo thuộc tính nào
		   Ví dụ: Item[] -> tăng dần id, giảm dần thêm name
		          String -> tăng, giảm dần
		   Lúc runtime, kiểm tra KDL của mảng a truyền vào[Object] có phải là
		   KDL con của interface Comparable<?> hay không
		   + Nếu class(KDL) truyền vào là con của Comparable<?> 
		     --> compile: hàm sort được gọi từng compareTo của Comparable<?>
		   	 --> runtime: dựa vào hàm compareTo(Object o)(override từ Comparable<?>) trong đó:
		   	     . this là phần từ đứng trước(leftmark)
		   	     . o là phần tử đứng sau(rightmark)
		   	     --> để biết công thức sort là gì
		   + Nếu class(KDL) truyền vào không phải là con của Comparable<?>
		      --> báo lỗi cast exception lúc runtime
		 */
		
		 Arrays.sort(items);
		 
		 generate("1. Sort items by price[asc]\n", items);
		 
		 // generate("2. Sort items by id[desc]", items)
		 // phải remove sort ở TH 1
		 
		 // Hạn chế của Arrays.sort(Object[] a)
		 // 1. Bắt lỗi casting tại runtime
		 // 2. Mỗi KDL của mảng chỉ được phép có 1 phương pháp sort
		 //    Vì sort phục thuộc vào override compareTo trong class truyền vào
		 
		 /*
		 Comparator<?> --> Compare_Item
		 Cách 2: Arrays.sort(T[] a, Comparator<? super T> c);
		 
		 // T nếu nó có implements Comparable<?> vẫn ưu tiên Comparator
		 */
		 
		Arrays.sort(items, new Comparator<Item>() {
			@Override
			public int compare(Item i1, Item i2) {
				return i1.getPrice().compareTo(i2.getPrice());
			}
		});
		generate("2. Sort items by price[asc]\n", items);
		
		items = DataModel.mockItems_NullValues();
		
		Arrays.sort(items, (i1, i2) -> {
			if (i1 == null) {
				return 1;
			}
			// i1 != null
			if (i2 == null) {
				return -1;
			}
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			int storeIdCompare = storeId1.compareTo(storeId2);
			
			if (storeIdCompare != 0) {
				return storeIdCompare;
			}
			
			return i2.getCreatedAt().compareTo(i1.getCreatedAt());
		});
		generate("3. Sort items by storeId[asc], createdAt[desc], null last\n", items);
		
	}
}
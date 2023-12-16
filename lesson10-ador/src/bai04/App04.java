package bai04;
import static utils.ArrayUtils.*;
import static java.util.Comparator.*;

import java.util.Arrays;
import java.util.function.Function;

import common.SortType;

public class App04 {
	public static void main(String[] args) {

		String[] dataSort = { "-2", "-6","Special", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		sortData(dataSort, SortType.ASC);
		generate("1.Sắp xếp tăng", dataSort);
		sortData(dataSort, SortType.DESC);
		generate("2.Sắp xếp giảm dần", dataSort);
	}

	private static void sortData(String[] dataSort, SortType sortType) {
		Arrays.sort(dataSort, nullsFirst(comparing(Function.identity())));
		Arrays.sort(dataSort, (s1, s2) -> {
			if(s1 == null || s2 == null) {
				return -1;
			}
			if (s1.equals("Special")) {
				return -1;
			}
			if (s2.equals("Special")) {
				return 1;
			}

			try {
				Integer num1 = Integer.parseInt(s1);
				Integer num2 = Integer.parseInt(s2);
				return num1.compareTo(num2);
			} catch (Exception e) {
				return s1.compareTo(s2);
			}
		});

		if (sortType == SortType.DESC) {
			reverse(dataSort);
		}
	}
}
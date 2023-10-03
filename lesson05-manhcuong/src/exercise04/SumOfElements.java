package exercise04;

import java.util.HashSet;
import java.util.Set;

public class SumOfElements {
	public static void main(String[] args) {
        int[] a = {1, 5, 8, 9, 2, 5, 9};
        int sum = sumOfNumberNotCoincide(a);
        System.out.println("Tổng các phần tử không trùng trong mảng ngoại trừ phần tử lớn nhất và nhỏ nhất: " + sum);
    }

    public static int sumOfNumberNotCoincide(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
            set.add(a[i]);
        }
        set.remove(min);
        set.remove(max);
        for (int num : set) {
            sum += num;
        }
        return sum;
    }
}


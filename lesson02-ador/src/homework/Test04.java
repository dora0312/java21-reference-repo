package homework;

import java.math.BigInteger;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		Integer[] facNum = new Integer[4];
		String[] label = {"a", "b", "c", "d"};
		BigInteger sumFacNum = BigInteger.ZERO;
		
		randomSoTuNhien(facNum);
		for( int index = 0; index < facNum.length; index++ ) {
			System.out.println("Giá trị của "+ label[index]+ ": " + facNum[index]);
			sumFacNum = sumFacNum.add(factCalcFun(facNum[index]));
		}
		System.out.println("Sum of a! + b! + c! + d! = " + sumFacNum);
		
	}
	private static void randomSoTuNhien(Integer[] facNum) {
		Random rd = new Random();
		for( int index = 0; index < facNum.length; index++ ) {
			facNum[index] = rd.nextInt(10, 21);
		}
	}
	private static BigInteger factCalcFun(Integer factNum) {
		BigInteger resFactNum = BigInteger.ONE;
		for( int count = factNum; count > 0; count-- ) {
			resFactNum = resFactNum.multiply(BigInteger.valueOf(count));
		}
		return resFactNum;
	}
}

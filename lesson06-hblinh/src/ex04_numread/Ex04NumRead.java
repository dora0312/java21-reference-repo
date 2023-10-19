package ex04_numread;

import java.util.Arrays;
import java.util.Scanner;
import ex04_numread.NumbertoString;
public class Ex04NumRead {
	static Scanner sc = new Scanner(System.in);
	NumbertoString a = new NumbertoString();	
	static int n = 0;
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		String n = sc.nextLine();
		Character[] chars = toCharNumString(n);
		if(chars.length==1) {
			oneDigitNumber(chars);
		}
		if(chars.length==2) {
			twoDigitNumber(chars);
		}
		if(chars.length==3) {
			threeDigitNumber(chars);
		}

		
	}
	
	public static Character[] toCharNumString(String n) {
		if (n == null) {
			return null;
		}
		Character[] chars = new Character[n.length()];
		for(int i = 0; i < n.length(); i++) {
			chars[i] = n.charAt(i);
		}
			return chars;
	}
	
	public static void oneDigitNumber(Character[] chars) {
		String[] arrays1 = new String[1];
			for(int k = 0; k < 10; k++) {
				if(chars[0]==NumbertoString.number[k]) {
					arrays1[0] = NumbertoString.numberRead[k];
				}
			}
		System.out.println(arrays1[0]);
	}
	
	
	public static void twoDigitNumber(Character[] chars) {
		if(chars[1]=='0'&&chars[0]=='1') {
			String[] arrays20 = new String[1];
					arrays20[0] = NumbertoString.unit[4];	
					System.out.println(Arrays.toString(arrays20));
			}
		//
		if(chars[0]=='1'&&chars[1]!=0) {
			String[] arrays1n = new String[2];
				for(int k = 1; k < 10; k++) {
					if(chars[1]==NumbertoString.number[k]) {
					arrays1n[1]= NumbertoString.numberRead[k];
					arrays1n[0]= NumbertoString.unit[4];
					System.out.println(Arrays.toString(arrays1n));}	
				}
			}
		else {
			String[] arrays2n = new String[3];
			for(int h = 0; h < 10; h++) {
				if(chars[0]==NumbertoString.number[h]) {
						arrays2n[0] = NumbertoString.numberRead[h];
						arrays2n[1] = NumbertoString.unit[0];
					}
					for(int i = 1; i < 10; i++) {
						if(chars[1]==NumbertoString.number[i])
							if(chars[1]=='5') {
								arrays2n[2] = NumbertoString.unit[3];
							} else {
						arrays2n[2] = NumbertoString.numberRead[i];
							}
					}
					
				}
			System.out.println(Arrays.toString(arrays2n));
			}
		}
	

	public static void threeDigitNumber(Character[] chars) {
		if(chars[1]=='0'&&chars[2]=='0') {
			String[] arrays300 = new String[2];
			for(int k = 0; k < 10; k++) {
				if(chars[0]==NumbertoString.number[k]) {
					arrays300[0] = NumbertoString.numberRead[k];
					arrays300[1] = NumbertoString.unit[1];
				}
			}
		System.out.println(Arrays.toString(arrays300));
	}
		else if(chars[1]=='0') {
			String[] arrays30n = new String[4];
			for(int k = 0; k < 10; k++) {
				if(chars[0]==NumbertoString.number[k]) {
					arrays30n[0] = NumbertoString.numberRead[k];
					arrays30n[1] = NumbertoString.unit[1];
					arrays30n[2] = NumbertoString.unit[2];
				}
				if(chars[2]==NumbertoString.number[k]) {
					arrays30n[3] = NumbertoString.numberRead[k];
				}
			}
		System.out.println(Arrays.toString(arrays30n));
	}
		else {
			String[] arrays3n = new String[4];
			for(int k = 0; k < 10; k++) {
				if(chars[0]==NumbertoString.number[k]) {
					arrays3n[0] = NumbertoString.numberRead[k];
					arrays3n[1] = NumbertoString.unit[1];
				}
				if(chars[1]==NumbertoString.number[k]) {
					if(chars[1]=='1') {arrays3n[2] = NumbertoString.unit[4];} else {
					arrays3n[2] = NumbertoString.numberRead[k];
					}
				}
				if(chars[2]==NumbertoString.number[k]) {
					if(chars[2]=='5') {
						arrays3n[3] = NumbertoString.unit[3];
					} else {
						arrays3n[3] = NumbertoString.numberRead[k];
					}
				}
			}
		System.out.println(Arrays.toString(arrays3n));
		}
	}
}

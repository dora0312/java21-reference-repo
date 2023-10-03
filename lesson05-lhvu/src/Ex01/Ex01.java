package Ex01;

	import java.lang.Math;
	import java.util.Scanner;
	
	public class Ex01 {
	  public static void main(String[] args) {
		  
	    Scanner sc = new Scanner(System.in);
	    double a, b, exponential;
	    System.out.println("Nhập vào hệ số: ");
	    a = sc.nextDouble();
	    System.out.println("Nhập vào số mũ: ");
	    b = sc.nextDouble();
	    exponential = Math.pow(a, b);
	    System.out.println(a + "^" + b + " = " + exponential);
	  }
	  
	}

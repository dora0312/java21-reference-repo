package ex02_password;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02PassWord {
	String password = "";
	static Scanner sc = new Scanner(System.in);
	static void validate1(String password )  throws  InvalidPassWordException   {
		if(!isValid1(password)) {
			throw new InvalidPassWordException("Erro!: At least 1 number");
		}}
	static void validate2(String password )  throws  InvalidPassWordException   {	
		if(!isValid2(password)) {
			throw new InvalidPassWordException("Erro!: At least 1 lowercase alphabetic character");
		}}
	static void validate3(String password )  throws  InvalidPassWordException   {	
		if(!isValid3(password)) {
			throw new InvalidPassWordException("Erro!: At least 1 uppercase alphabetic character");
		}}
	static void validate4(String password )  throws  InvalidPassWordException   {	
		if(!isValid4(password)) {
			throw new InvalidPassWordException("Erro!: At least 1 special character");
		}}
	static void validate5(String password )  throws  InvalidPassWordException   {
		if(!isValid5(password)) {
			throw new InvalidPassWordException("Erro!: At least between 8 to 256 character");
		}
	}
	public static void main(String[] args) {	
		do {
			System.out.println("Enter password: ");
			String password = sc.nextLine();
			isValid(password);
			try {
				validate1(password);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				validate2(password);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				validate3(password);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				validate4(password);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				validate5(password);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);		
	}
	private static final String PASSWORD_PATTERN =
	            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,256}$";
	
	private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

	public static void isValid(final String password) {
	        Matcher matcher = pattern.matcher(password);
	        if(matcher.matches()) {
	        	System.out.println("Valid password");
	        } 
	        
	    }

	private static final String PASSWORD1 =
	            "(.*)[0-9](.*)";
	public static final Pattern pattern1 = Pattern.compile(PASSWORD1);
	public static boolean isValid1(final String password) {
	        Matcher matcher1 = pattern1.matcher(password);
	        return matcher1.matches();
	}
	private static final String PASSWORD2 =
	            "(.*)[a-z](.*)";
	public static final Pattern pattern2 = Pattern.compile(PASSWORD2);
	public static boolean isValid2(final String password) {
	        Matcher matcher2 = pattern2.matcher(password);
	        return matcher2.matches();
	}
	private static final String PASSWORD3 =
            "(.*)[A-Z](.*)";
	public static final Pattern pattern3 = Pattern.compile(PASSWORD3);
	public static boolean isValid3(final String password) {
	        Matcher matcher3 = pattern3.matcher(password);
	        return matcher3.matches();
}
	private static final String PASSWORD4 =
            "(.*)[!@#&()–[{}]:;',?/*~$^+=<>](.*)";
	public static final Pattern pattern4 = Pattern.compile(PASSWORD4);
	public static boolean isValid4(final String password) {
        Matcher matcher4 = pattern4.matcher(password);
        return matcher4.matches();
}
	private static final String PASSWORD5 =
	            ".{8,256}";
	public static final Pattern pattern5 = Pattern.compile(PASSWORD5);
	public static boolean isValid5(final String password) {
	        Matcher matcher5 = pattern5.matcher(password);
	        return matcher5.matches();
	}	
}

	
	

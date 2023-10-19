package ex03_checkmail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ex03CheckMail {
		String mail = "";
		static String prefix = "";
		static String domain = "";
		static String symbol = "@";
		static Scanner sc = new Scanner(System.in);
		
		static void validate1(String prefix )  throws  InvalidMailException   {
			if(!isValid1(prefix)) {
				throw new InvalidMailException("prefix invalid");
			}}
		static void validate2(String domain )  throws  InvalidMailException   {	
			if(!isValid2(domain)) {
				throw new InvalidMailException("doamin invalid");
			}}
		public static void main(String[] args) {	
			do {
				System.out.println("Enter mail: ");
				String mail = sc.nextLine();
				isValid(mail);
				try {
					String[] tokens = mail.split("@");
					prefix = tokens[0];
					domain = tokens[1];
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("symbol invalid");
					return;
				}	
				try {
					validate1(prefix);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				try {
					validate2(domain);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} while (true);		
		}
		private static final String MAIL_PATTERN =
		            "^[a-z0-9]+[.|-|_]{0,1}[a-z0-9]+@mail\\.com$";
		
		private static final Pattern pattern = Pattern.compile(MAIL_PATTERN);

		public static void isValid(final String mail) {
		        Matcher matcher = pattern.matcher(mail);
		        if(matcher.matches()) {
		        	System.out.println("Valid mail");
		        }   
		    }

		private static final String MAIL1 =
		            "[a-z0-9]+[.|-|_]{0,1}[a-z0-9]+";
		public static final Pattern pattern1 = Pattern.compile(MAIL1);
		public static boolean isValid1(final String prefix) {
		        Matcher matcher1 = pattern1.matcher(prefix);
		        return matcher1.matches();
		}
		private static final String MAIL2 =
		            "mail.com";
		public static final Pattern pattern2 = Pattern.compile(MAIL2);
		public static boolean isValid2(final String domain) {
		        Matcher matcher2 = pattern2.matcher(domain);
		        return matcher2.matches();
		}
	}

		
		



package ultils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringUltils {
	private static final String VIETNAMESE_DIACRITIC_CHARACTERS = "ẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ";
	public static boolean isContainsVNChar(String yourStr) {
		for(char c:VIETNAMESE_DIACRITIC_CHARACTERS.toCharArray()) {
			if(yourStr.contains(Character.toUpperCase(c)+"") || yourStr.contains(Character.toLowerCase(c)+"")) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean verifyStringLenght(String yourStr, int minimumLen, int maximunLen)  {
		if(yourStr.length() > minimumLen || maximunLen < yourStr.length()) {
			// throw new TestValidExceptionUltils("At least 8 characters !!!");
			// throw new TestValidExceptionUltils("At most 256 characters !!!");
			return true;
		}
		return false;
	}
	public static boolean verifyExistLowercase(String yourStr)  {
		if (yourStr.matches(".*[a-z].*")) {
			// throw new TestValidExceptionUltils("At least 1 lowercase alphabetic character(a, b, c,...) !!!");
			return true;
		}
		return false;
	}
	public static boolean verifyExistUppercase(String yourPass)  {
		if (yourPass.matches(".*[A-Z].*")) {
			// throw new TestValidExceptionUltils("At least 1 UPPERCASE alphabetic character(A, B, C,...) !!!");
			return true;
		}
		return false;
	}
	public static boolean verifyExistNumber(String yourStr)  {
		if (yourStr.matches(".*\\d.*")) {
			// throw new TestValidExceptionUltils("At least 1 number(1, 2, 3,...) !!!");
			return true;
		}
		return false;
	}
	public static boolean verifyExistSpecialSymbols(String yourStr)  {
		// do not check blank
		yourStr = yourStr.strip().replaceAll("\\s+", "");
		if (yourStr.matches(".*\\W.*")) {
			// throw new TestValidExceptionUltils("At least 1 special character(~,$,#,%,@,... !!!");
			return true;
		}
		return false;
	}
	public static boolean verifyExistBlank(String yourStr)  {
		if (yourStr.matches(".*\\s.*")) {
			// throw new TestValidExceptionUltils("At least 1 blank !!!");
			return true;
		}
		return false;
	}
	
	public static String toNotAccentedWay1(String yourStr) { 
		String chgString = Normalizer.normalize(yourStr, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		chgString = pattern.matcher(chgString).replaceAll("").replaceAll("đ", "d").replaceAll("Đ", "D"); 
		return chgString;
	}
	
	public static String toNotAccentedWay2(String yourStr) { 
	    yourStr = yourStr.replaceAll("à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ", "a");
	    yourStr = yourStr.replaceAll("è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ", "e");
	    yourStr = yourStr.replaceAll("ì|í|ị|ỉ|ĩ", "i");
	    yourStr = yourStr.replaceAll("ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ", "o");
	    yourStr = yourStr.replaceAll("ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ", "u");
	    yourStr = yourStr.replaceAll("ỳ|ý|ỵ|ỷ|ỹ", "y");
	    yourStr = yourStr.replaceAll("đ", "d");

	    yourStr = yourStr.replaceAll("À|Á|Ạ|Ả|Ã|Â|Ầ|Ấ|Ậ|Ẩ|Ẫ|Ă|Ằ|Ắ|Ặ|Ẳ|Ẵ", "A");
	    yourStr = yourStr.replaceAll("È|É|Ẹ|Ẻ|Ẽ|Ê|Ề|Ế|Ệ|Ể|Ễ", "E");
	    yourStr = yourStr.replaceAll("Ì|Í|Ị|Ỉ|Ĩ", "I");
	    yourStr = yourStr.replaceAll("Ò|Ó|Ọ|Ỏ|Õ|Ô|Ồ|Ố|Ộ|Ổ|Ỗ|Ơ|Ờ|Ớ|Ợ|Ở|Ỡ", "O");
	    yourStr = yourStr.replaceAll("Ù|Ú|Ụ|Ủ|Ũ|Ư|Ừ|Ứ|Ự|Ử|Ữ", "U");
	    yourStr = yourStr.replaceAll("Ỳ|Ý|Ỵ|Ỷ|Ỹ", "Y");
	    yourStr = yourStr.replaceAll("Đ", "D");
	    return yourStr;
	}
}

package untils;

import java.math.BigDecimal;

public class NumberUtils {
	private NumberUtils() {
	}
	public static BigDecimal db(double doubleValue) {
		return new BigDecimal(String.valueOf(doubleValue));
	}
}

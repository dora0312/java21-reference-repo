package exam.bai03;

public class App03 {
	
	public static void main(String[] args) {
		String input = "12abu02muzk586cyx";
        String largestNumber = findLargestNaturalNumber(input);
        System.out.println("Số tự nhiên lớn nhất trong chuỗi là: " + largestNumber);
	}
	
	public static String findLargestNaturalNumber(String input) {
        String largestNumber = "";
        String currentNumber = "";

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber += c;
            } else if (!currentNumber.isEmpty()) {
                // Nếu đã có số và gặp ký tự khác, so sánh với số lớn nhất hiện tại
                if (currentNumber.length() > largestNumber.length() || 
                    (currentNumber.length() == largestNumber.length() && currentNumber.compareTo(largestNumber) > 0)) {
                    largestNumber = currentNumber;
                }
                currentNumber = ""; // Đặt lại chuỗi số hiện tại
            }
        }

        // Xử lý trường hợp số lớn nhất nằm ở cuối chuỗi
        if (!currentNumber.isEmpty() && (currentNumber.length() > largestNumber.length() || 
            (currentNumber.length() == largestNumber.length() && currentNumber.compareTo(largestNumber) > 0))) {
            largestNumber = currentNumber;
        }

        return largestNumber;
    }
}

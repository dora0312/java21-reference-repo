package exception;

public class InvalidImageException extends Exception {
	/*
	  text data
	  serialized data
	  --> mã hóa bytecode
	 */
	private static final long serialVersionUID = -3569727925756722826L;

	public InvalidImageException(String message) {
		super(message);
	}
}

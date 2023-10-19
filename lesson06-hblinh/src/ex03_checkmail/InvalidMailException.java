package ex03_checkmail;

public class InvalidMailException extends Exception {
	InvalidMailException(String s){
		super(s);
	}
}

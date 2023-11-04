package view.string.mutable;

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		// String Immutable: String
		// String Mutable: String Builder
		// 				   String Buffer
		
		StringBuilder sb1 = new StringBuilder("todo-app-2.4");
							sb1.append("-snapshot").append("-test");
		
		System.out.println("sb --> " + sb1);
		System.out.println("adres: " + System.identityHashCode(sb1));
		sb1.deleteCharAt(0);
		System.out.println("\nsb after deleteCharAt--> " + sb1);
		
		sb1.setCharAt(0, 'a');
		System.out.println("\nsb after setCharAt--> " + sb1);
		
		System.out.println("adres: " + System.identityHashCode(sb1));
		
		sb1.delete(0, sb1.length());
		System.out.println("delete all: " + System.identityHashCode(sb1));
		sb1 =  new StringBuilder();
		System.out.println("new adres: " + System.identityHashCode(sb1));
	}
}

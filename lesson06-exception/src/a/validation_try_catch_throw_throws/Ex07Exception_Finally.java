package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07Exception_Finally {
	public static void main(String[] args) {
		String [] employees = mockData();
		File file = new File("data.txt");
		FileWriter fw = null;
		try {
			// open/connect to file
			fw = new FileWriter(file);
			if (fw != null) {
				for(String employee: employees) {
					String newLine = createNewLine(employee);
					if(newLine != null) {
						fw.write(newLine + "\n");
						System.out.println(">>>> " + newLine);
					}
				}
				// File to close here will be fail: Khi nội dung truyền vào bị exception
				// fw.close();
			}
		} catch(NumberFormatException | IOException e) {
			e.printStackTrace();
			// fw.close(); --> save/close file --> invalid khi nội dung không bị exception
		} finally {
			// LUÔN ĐƯỢC THỰC THI dù try có bị exception, exception có bắt được hay ko
			close(fw);
		}
		// save->close file
		System.out.println("Write file finished");
	}
	
	private static String createNewLine(String employee) {
		String newLine = null;
		try {
			String[] tokens = employee.split(", ");
			
			String id = tokens[0];
			String name = tokens[1];
			int age = Integer.parseInt(tokens[2]);
			int factor = (age - 18) * 2;
			
			newLine = id + ", " + name + ", " +factor;
		} catch(NumberFormatException | IndexOutOfBoundsException e) {
			System.out.println("Skip line ---> " + employee + " is invalid format !!!");
		}
		return newLine;
	}
	
	private static String[] mockData() {
		return new String[] {
				"1, Le Na, 26",
				"2, Minh Anh, 24",
				"3, Ngoc Hoa, 25",
				"4, Van Tan, 27",
				"5, Quoc Anh, 28",
				"6, Minh Duy, a0",
				"7, Lan Phuong, 20",
				"8, Phong Tran, 21",
				// ................
				"98, Phong Khuong, 32",
				"99, Phong Tung, 18",
				"100, Phong Van, 19"
		};
	}
	
	private static void close(FileWriter fw) {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 }

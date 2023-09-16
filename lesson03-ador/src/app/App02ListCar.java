package app;

import java.util.Scanner;

import bean.Car;
import bean.Human;
import bean.HumanInfo;
import utils.Utils;

public class App02ListCar {
	 /*
	 h1: Nguyen Van A, {c1(Honda, 100cc, 530, 1), c2(Suzuki, 199cc, 450, 2)
	 h1: Nguyen Van B, {c1(Mazda, 100cc, 450, 1), c2(Suzuki, 100cc, 200, 1)
	 h1: Nguyen Van C, {c1(Honda, 150cc, 300, 2), c2(Toyota, 200cc, 150, 2)
	 */
	public static void main(String[] args) {
		// Nhập thông tin người dân
//		Human h1 = new Human("Nguyễn Văn A", "1234", "Đà Nẵng");
//		Car car1 = new Car("Honda", 100, 530, 1);
//		Car car2 = new Car("Suzuki", 199, 450, 2);
//		HumanInfo h1Info = new HumanInfo(h1, new Car[]{car1, car2});
//		
//		Human h2 = new Human("Nguyễn Văn B", "5678", "Kon Tum");
//		Car car3 = new Car("Mazda", 100, 450, 1);
//		Car car4 = new Car("Suzuki", 100, 200, 1);
//		HumanInfo h2Info = new HumanInfo(h2, new Car[]{car3, car4});
//		
//		Human h3 = new Human("Nguyễn Văn C", "91011", "Hà Nội");
//		Car car5 = new Car("Honda", 150, 300, 2);
//		Car car6 = new Car("Toyota", 200, 150, 2);
//		HumanInfo h3Info = new HumanInfo(h3, new Car[]{car5, car6});
//		
//		HumanInfo[] printInfo = new HumanInfo[]{h1Info, h2Info, h3Info};
//		Utils.printHumanInfo(printInfo);
//		System.out.println("Human Info: " + h1Info);
//		System.out.println("Human Info: " + h2Info);
//		System.out.println("Human Info: " + h3Info);
		
//		Utils.printHumanInfo(h1Info);
//		Utils.printHumanInfo(h2Info);
//		Utils.printHumanInfo(h3Info);
		
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số người dân: ");
        int humanQty = Integer.parseInt(sc.nextLine());
        int checkQty = 0;
        
        HumanInfo[] humanInfo = new HumanInfo[humanQty];
        do {
        	System.out.print("Nhập tên người dân " + (checkQty +1 ) + ": ");
        	String name = sc.nextLine();
        	System.out.print("Nhập số điện thoại " + (checkQty +1 ) + ": ");
        	String phone = sc.nextLine();
        	System.out.print("Địa chỉ " + (checkQty +1 ) + ": ");
        	String adrr = sc.nextLine();
        	System.out.print("Nhập số lượng xe hiện có: ");
        	int qtyCar = Integer.parseInt(sc.nextLine());
        	Human human = new Human(name, phone, adrr);
        	Car[] car = new Car[qtyCar];
        	int countSl = 0;
        	for(int i = 0; i < qtyCar; i++) {
        		System.out.print("Nhập tên xe" + (i +1 ) + ": ");
            	String carName = sc.nextLine();
            	System.out.print("Nhập dung tích xe" + (i +1 ) + ": ");
            	int cc = Integer.parseInt(sc.nextLine());
            	System.out.print("Nhập giá xe" + (i +1 ) + ": ");
            	int price = Integer.parseInt(sc.nextLine());
            	int sl;
            	System.out.print("Số lượng xe" + (i +1 ) + ": ");
            	if( countSl >= qtyCar - 1) {
            		sl = 1;
            	} else {
            		sl = Integer.parseInt(sc.nextLine());
            	}
            	
            	countSl += sl;
            	if( i + countSl >= qtyCar) {
            		car[i] = new Car(carName, cc, price, sl);
            		break;
            	} else {
            		car[i] = new Car(carName, cc, price, sl);
            	}
            	
        	}
        	HumanInfo h = new HumanInfo(human, car);
        	humanInfo[checkQty] = h;
        	checkQty++;
        } while(checkQty < humanQty);
        
        Utils.printHumanInfo(humanInfo);
        
		sc.close();
	}

}

package kodlamaVakti2;

import java.util.Scanner;

public class EmpDriver {
	public static void main(String[] args) {

		// Yilbasi zamlarini ogrenmek icin 4lu constuructoru kullanacagiz.
		// Aylik rutin maaslar icin 3lu constructoru kullanacagiz.
		Employee isci1 = new Employee("Ali", 2000, 45);
		Employee isci2 = new Employee("Veli", 2600, 35, 1990);
		Employee isci3 = new Employee("Ahmet", 2900, 25, 1980);
		Employee isci4 = new Employee("Mehmet", 2400, 40, 1988);

		// bkz.static counter in Employee class.
		System.out.println("Toplam isci sayisi : " + Employee.counter);

		// ciktisini almak istedigimiz isciyi toStringi cagirarak gorebiliriz.
		System.out.println(isci1.toString());
		
//		//Employee register programi icin kullanici girisi;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Name : ");
//		String name = scanner.nextLine();
//		System.out.println("Salary : ");
//		int salary = scanner.nextInt();
//		System.out.println("Work Hour : ");
//		int workHour = scanner.nextInt();
//		System.out.println("Hire Year : ");
//		int hireeYear = scanner.nextInt();
//		Employee employee = new Employee (name,salary,workHour,hireeYear);
//		System.out.println(employee.toString());
	
	}

}

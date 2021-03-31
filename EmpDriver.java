package kodlamaVakti2;

public class EmpDriver {
	public static void main(String[] args) {

		Employee isci1 = new Employee("Ali", 2000, 45, 1985);
		Employee isci2 = new Employee("Veli", 2600, 35, 1990);
		Employee isci3 = new Employee("Ahmet", 2900, 25, 1980);
		Employee isci4 = new Employee("Mehmet", 2400, 40, 1988);
		// istersek ozellik adini yazarak name, hireYear falan degistirebiliriz. ornek asagida.

//		isci1.name = "Ertu";
//		System.out.println(isci1.name);

		//ciktisini almak istedigimiz isciyi toStringi cagirarak gorebiliriz.
		System.out.println(isci1.toString());

	}

}

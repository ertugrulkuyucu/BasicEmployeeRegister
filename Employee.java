package kodlamaVakti2;

public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;

	// static driverin içinde direkt counteri çagirmamiza yardimci oldu. static
	// kalkinca degiskenler gorunmuyor mainin içinde.
	static int counter = 0;

	Employee(String name, double salary, int workHours, int hireYear) {

		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;

		// her isci girisi yaptiginda sayacimiz calisiyor.
		counter++;

	}

	Employee(String name, double salary, int workHours) {

		this.name = name;
		this.salary = salary;
		this.workHours = workHours;

		counter++;

	}

	// Bu method iscinin vergiye girip girmedigini hesapli
	public double tax() {
		if (salary >= 2500) {
			double tax = salary * 0.03;
			return tax;
		}

		return 0.0;
	}

	// Bu method da haftalik calisma saati verilen iscinin ne kadar fazla calistigi
	// ve ne kadar bonus almasi gerektigi hesaplanmaktadir.
	public double bonus() {
		int extra = workHours - 40;
		if (extra > 0) {
			double bonus = extra * 30;
			return bonus * 4;
		}
		return 0.0;
	}

	// bu method da maasin artisi hesaplanmaktadir.
	public double raiseSalary() {
		if (hireYear > 0) {
			int experience = 2020 - hireYear;
			double RaiseRatio;
			if (experience > 19) {
				return RaiseRatio = salary * 0.15;
			} else if (experience < 10) {
				return RaiseRatio = salary * 0.05;
			}
			return 0.10;
		}
		return 0;
	}

	public String toString() {

		String personalInformation = "Name = " + name + "\nSalary = " + salary + "\nWork Hour = " + workHours
				+ "\nHire Date = " + hireYear;
		String taxString = "\nTax = " + tax();
		String bonusString = "\nBonus = " + bonus();
		String raiseSalary = "\nRaise of Salary = " + raiseSalary();
		double withTaxAndBonusSalary = salary + bonus() - tax();
		String salaryWithTaxAndBonus = "\nSalary With Tax And Bonus = " + withTaxAndBonusSalary;
		double withRaiseSalary = withTaxAndBonusSalary + raiseSalary();
		String salaryWithRaise = "\nSalary With Raise = " + withRaiseSalary;

		return personalInformation + taxString + bonusString + raiseSalary + salaryWithTaxAndBonus + salaryWithRaise;
	}

}

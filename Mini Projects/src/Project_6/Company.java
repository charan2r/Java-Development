package Project_6;

public class Company {
	public static void main(String[]args) {
		Employee emp1 = new Employee("Amal",30);
		Employee emp2 = new Employee("Shanaka", 25);
		
		System.out.println(emp1.getname());
		System.out.println(emp1.getage());
		emp1.dowork("Arrange the files");
		
		System.out.println(emp2.getname());
		System.out.println(emp2.getage());
		emp1.dowork("Answer the calls");
		
	}

}

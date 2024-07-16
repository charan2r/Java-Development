package Project_6;

public class Employee {
	private String name;
	private int age;
	private double salary;
	private String department;
	
	Employee(String name, int age){
		this.name=name;
		this.age=age;
	}
	String getname() {
		return name;
	}
	int getage() {
		return age;
	}
	String getdepartment() {
		return department;
	}
	double getsalary() {
		return salary;
	}
	void setsalary(double newsalary) {
		salary=newsalary;
	}
	void dowork(String worktoPerform) {
		System.out.println("I need to do : " +worktoPerform);
	}
	
	public static void main(String[]args) {
		Employee emp = new Employee("Amal",30);
		System.out.println(emp.getname());
		System.out.println(emp.getage());
		
		emp.setsalary(75000.00);
		System.out.println(emp.getsalary());
	}

}

package Project_6;

public class TemporaryEmployee extends Employee {
	private String EndofAppointment;
	
	TemporaryEmployee(String name, int age, String dateEndofAppointment){
		super(name,age);
		EndofAppointment=dateEndofAppointment;
		
	}
	public String getEndofAppointment() {
		return EndofAppointment;
	}
	public void setEndofAppointment(String dateEndofAppointment) {
		EndofAppointment=dateEndofAppointment;
	}
	public double getsalary() {
		return super.getsalary()+1000;
	}
	public static void main(String[]args) {
		TemporaryEmployee emp2 = new TemporaryEmployee("Shanaka",25,"2021-10-10");
		System.out.println(emp2.getname());
		System.out.println(emp2.getage());
		System.out.println(emp2.getEndofAppointment());
		emp2.dowork("Answer the calls");
		emp2.setsalary(50000);
		System.out.println(emp2.getsalary());
	}

}

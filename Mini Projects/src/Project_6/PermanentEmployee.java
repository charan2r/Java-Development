package Project_6;

public class PermanentEmployee extends Employee {
	private double yearlyBonus;
	private int leaves;
	
	PermanentEmployee(String name, int age, int leaves){
		super(name,age);
		this.leaves=leaves;
	}
	public double getyearlyBonus() {
		return yearlyBonus;
	}
	public void setyearlyBonus(double allocatedyearlyBonus){
		yearlyBonus = allocatedyearlyBonus;
	}
	public int getleaves(){
		return leaves;
	}
	public double getsalary() {
		return super.getsalary() - super.getsalary()*0.1;
	}
	public static void main(String[]args) {
		PermanentEmployee emp1 = new PermanentEmployee("Amal",30,20);
		System.out.println(emp1.getname());
		System.out.println(emp1.getage());
		System.out.println(emp1.getleaves());
		emp1.setyearlyBonus(20000);
		System.out.println(emp1.getyearlyBonus());
		emp1.setsalary(75000);
		System.out.println(emp1.getsalary());
	}
}

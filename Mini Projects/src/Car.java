public class Car{
	
		boolean lefthandDrive;
	    int doors;
	    int gears;
	    String color;


    public Car(){
		System.out.println("Color :" + color);
		System.out.println("Gears are :" + gears);
		System.out.println("Doors are :" + doors);
		System.out.println("Left hand drive: " + lefthandDrive);
	
	}
	public static void main(String[] args){	
		Car Toyota = new Car();
		Toyota.lefthandDrive = true;
		Toyota.color = "Black";
		Toyota.doors = 4;
		Toyota.gears = 5;
		
		System.out.println("Color: " + Toyota.color);
        System.out.println("Gears are: " + Toyota.gears);
        System.out.println("Doors are: " + Toyota.doors);
        System.out.println("Left hand drive: " + Toyota.lefthandDrive);
	}
	 
	
}



public class Animal {
	String name;
	Animal(String n){
		name=n;
	}

	public String toString() {
        return "Animal [name=" + name + "]";
    }
	

}
class Myclass{
	public static void main(String[]args) {
		Animal a1 = new Animal("rob");
		Animal a2 = new Animal("rob");
		System.out.println(a1);
	}
}

import java.util.Iterator;
import java.util.ArrayList;

public class Animals {
	public static void main(String[]args){
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("fox");
		animals.add("lion");
		animals.add("tiger");
		Iterator<String> it = animals.iterator();
		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
		
	}

}

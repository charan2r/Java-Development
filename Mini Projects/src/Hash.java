
import java.util.HashMap;

public class Hash {
	public static void main(String[]args) {
		HashMap<String, Integer> point = new HashMap<String, Integer>();
		point.put("Amy", 10);
		point.put("Dave", 20);
		System.out.println(point.get("Dave"));
		System.out.println(point.get("Amy"));
	}

}

import java.util.ArrayList;

public class Array {
	public static void main(String[]args){
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("brown");
		colors.remove("brown");
		colors.add("blue");
		System.out.println(colors);
	}

}

import java.util.Scanner;
public class Student{
	public static void main(String[] args){
		try (Scanner s = new Scanner(System.in)) {
			int s_marks;
			System.out.println("enter your name");
			System.out.println("enter your marks");
			s_marks = s.nextInt();
			if (100>s_marks && s_marks<=75) {
				System.out.println("A");

			} else if (74>s_marks && s_marks<=65) {
				System.out.println("B");

			} else if (64>s_marks && s_marks<=55) {
				System.out.println("C");
				
			} else if (54>s_marks && s_marks<=45) {
				System.out.println("D");
				
			} else if (44>s_marks && s_marks<=35) {
				System.out.println("S");
				
			} else if (s_marks<34) {
				System.out.println("F");
				
			} else
			    System.out.println("Invalid Marks");
		}

	}
}
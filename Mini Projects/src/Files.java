
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
	public static void main(String[]args) {
		File x =new File("E:\\Books\\High Education\\OUSL BSE\\Year 1\\Semester 1\\Information Systems and Data Management\\Codes\\SQL\\12.txt");
		if(x.exists()) {
			System.out.println(x.getName() + "exists");
		}
		else {
			System.out.println("doesn't exist");
		}
	}{
	try {
		File x =new File("E:\\Books\\High Education\\OUSL BSE\\Year 1\\Semester 1\\Information Systems and Data Management\\Codes\\SQL\\12.txt");
		try (Scanner sc = new Scanner(x)) {
		}
		Scanner sc = null;
		while(sc.hasNext()) {
			System.out.println(sc.hasNext());
		}
		sc.close();
		
	} catch (FileNotFoundException e) {
		
	}
   }
}

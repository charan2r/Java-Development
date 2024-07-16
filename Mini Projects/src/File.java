
import java.io.FileNotFoundException;
import java.util.Formatter;

public class File {
	public static void main(String[]args) {
		try {
			Formatter f = new Formatter("E:\\Books\\High Education\\OUSL BSE\\Year 1\\Semester 1\\Information Systems and Data Management\\Codes\\SQL\\12.txt");
			f.format("%s %s %s", "1","John","Smith\r\n");
			f.format("%s %s %s", "2","Adam","Browns");
			f.close();
					
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			
		}
		System.out.println("error");
	}
}

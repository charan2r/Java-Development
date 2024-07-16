public class Exception {
	public static void main(String[]args) {}
		int div(int a,int b) 
		throws ArithmeticException{
			if(b==0) {
				throw new ArithmeticException("division by zero");
			}
			else {
				return a/b;
			}
		}
	
}



package functions;

public class ParameterCheck {
	 public boolean isSameNumber(int number1, int number2) {
		
		 if(number1 == number2) {
			 return true;
		 }else {
		 return false;
		 }
		 
	 }

	 public static void main(String[] args) {
		ParameterCheck paCheck = new ParameterCheck();
		boolean status = paCheck.isSameNumber(4, 8);
		System.out.println("Is two parameter same ? ="+status);
	}
}

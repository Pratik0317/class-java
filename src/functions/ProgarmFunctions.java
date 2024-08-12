package functions;

public class ProgarmFunctions {

	protected final float pi = (float) 3.14;
	
	public void display() {
		System.out.println("Hello, I am called");
	}
	
public int getTotal(int n, int m) {
	return n+m;
}
public int mul(int x, int y) {
	return x*y;
}

public float areaOfCircle(int r) {
	return 2*pi*r*r;
}
public float circumference(int r) {
	return 2*pi*r;
}

public String eligilible(int age) {
	if(age>=18) {
		//System.out.println("You are eligible to vote");
		return "You are eligible to vote";
	}else {
		//System.out.println("You are not eligible to vote");
		return "You are not eligible to vote";
	}
}

public int getFactorial(int number) {
	int facto = 1;
for(int i=1;i<=number;i++) {
	facto *=i;
}
return facto;
}

public void averageNumber(int num1, int num2, int num3) {
	if(num1>=num2&& num1>=num3) {
		System.out.println("Largest number is: "+num1);
	}else if (num2>=num1&&num2>=num3) {
		System.out.println("Largest number is: "+num2);
	}else {
		System.out.println("Largest number is: "+num3);
	}
	
	if(num1<=num2&& num1<=num3) {
		System.out.println("Lowest number is: "+num1);
	}else if (num2<=num1&&num2<=num3) {
		System.out.println("Lowest number is: "+num2);
	}else {
		System.out.println("Lowest number is: "+num3);
	}
}

public int sum(int num1, int num2, int num3) {
	return num1+num2+num3;
}

public void displayNumber(int start, int end) {
	for(int i=start;i<=end;i++) {
		System.out.println(i);
	}
}

public boolean checkPrime(int testNumber) {
	if(testNumber<2) {
		return false;
	}
	for(int i = 2; i<= Math.sqrt(testNumber);i++) {
		if(testNumber%i==0) {
			return false;
		}
	}
	return true;
}

public void displayPrime() {
  for(int i =1;i<=1000;i++) {
	  if(checkPrime(i)== true) {
		  System.out.println(i);
	  }
  }
}

//multiplication table 
public void printMultiplication(int inputNumber) {
	for(int i=1;i<=10;i++) {
		System.out.println(inputNumber+"*"+i+"="+inputNumber*i);
	}
	
}

	
}

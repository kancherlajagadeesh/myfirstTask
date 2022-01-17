package javafirstTask.come;

public class ReturnType {

	public static void main(String[] args) {
		int addition= addition(2,5);
		System.out.println("The addition of 5 and 6 is "+ addition);

		System.out.println();


		callingMethod cal= new callingMethod();

		System.out.println("Call by value Before is "+cal.value);
		cal.change(130);
		System.out.println("Call by value after is "+cal.value);

		System.out.println();

		area(2,5);

		area(7);
	}

	static int addition(int num1, int num2){

		return num1+num2;

	}

	static void area(int num1, int num2) {
		System.out.println("The area of rectangle is "+ (num1*num2));
	}
	static void area(int num1) {
		System.out.println("The area of square is "+ (num1*num1));
	}

}

class callingMethod{
	int value=100;

	int change(int value) {
		this.value=value + 200;
		return this.value;
	}
}



	

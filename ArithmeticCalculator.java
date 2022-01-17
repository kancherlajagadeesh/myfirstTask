package javafirstTask.come;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Operator : ");
		String oper = scan.nextLine();

		int first,second;
		System.out.println("Enter the first number");
		first = scan.nextInt();
		System.out.println("Enter the second number");
		second = scan.nextInt();



		switch (oper) {
		case "+": {
			System.out.println("Addition \n The sum of the 2 numbers is :" + (first+second));
			break;
		}
		case "-":{
			System.out.println("Subtraction \n The difference between 2 numbers is :"+ (first-second));
			break;
		}
		case "*" : {
			System.out.println("Multiplication \n The multiplication of 2 numbers is:" + (first*second));
			break;

		}
		case "/" : {
			System.out.println("Division");
			int result;
			try {result=first/second;
				System.out.println("The division of 2 numbers is :"+ result);
			} catch (ArithmeticException ae) {
				System.out.println("Sorry cannot divide with 0 \n The error is"+ ae.getMessage());
			}
			break;
		}
		default:
			System.out.println("The operator is illegal \n Abort!!!");
		}


	}

}



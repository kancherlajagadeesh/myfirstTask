package javafirstTask.come;

import java.util.Scanner;

public class WorkingWithStringArray {

	public static void main(String[] args) {
		int no;
		Scanner input = new Scanner(System.in);
		System.out.println("How many members you have in your Mphasis");
		no = input.nextInt();
		input.skip(System.lineSeparator());
		String []names=new String[no];
		for(int value=0; value<no; value++) {
			System.out.println("Enter name of Mphasis members"+(value+1));
			names [value]=input.nextLine();
				}
		input.close();
		System.out.println("your Mphasis members are:");
		for(int value =0; value<no; value++) {
			System.out.println(names[value]);
		}
		
		

	
	

	}

}

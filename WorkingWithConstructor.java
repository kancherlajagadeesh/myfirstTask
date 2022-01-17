package javafirstTask.come;

public class WorkingWithConstructor {

	
		int empID;
		String name;
		void display() {
			System.out.println(empID +" : "+ name);
		}


		public static void main(String[] args) {
			WorkingWithConstructor emp1 = new WorkingWithConstructor();
			emp1.display();//default constructor gave values 0 and null



			paraConstructor emp2 = new paraConstructor(2489206, "Jagadeesh");

		}

	}
	class paraConstructor{
		int empID;
		String name;
		paraConstructor(int empID,String name) {// parametrized constructor
			this.empID=empID;
			this.name=name;
			System.out.println(empID +" : "+ name);
		}
	}


	



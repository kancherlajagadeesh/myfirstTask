package javafirstTask.come;
public class InnerClass {

	public static void main(String[] args) {
		jagadeesh dev = new jagadeesh() {

			@Override  
			public void prabha() {
				System.out.println("annonymous inner class");// annonymous inner class
			}
		};
		dev.prabha();

		govindam gov = new govindam();
		gov.home(new jagadeesh() {
			@Override
			public void prabha() {
				System.out.println();
				System.out.println("Argument based annonymous inner class");
			}

		});

		System.out.println();

		new outer().new inner().print();

		System.out.println();



	}

}


interface jagadeesh{
	void prabha();
}


class govindam {
	void home(jagadeesh ref) {
	ref.prabha();}
}

class outer{
	class inner{
		void print() {
			System.out.println("Regular inner class");
		}
	}
}



class Outer{
	void func() {
		class Inner{
			void print() {
				System.out.println("Method local inner class");
			}
		}
		new Inner().print();
	}
}


	

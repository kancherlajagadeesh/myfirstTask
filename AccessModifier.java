package javafirstTask.come;

public class AccessModifier {

	public static void main(String[] args) {
		defaultAccessSpecifier def = new defaultAccessSpecifier();
		def.display();
		

		privateAccessSpecifier pri = new privateAccessSpecifier();
		//pri.view();    //error as private methods of another class cannot be accessed
}
}

class defaultAccessSpecifier{
	void display() {
		System.out.println("Class with default access specifier");
	}


}



class privateAccessSpecifier{

	private void view(){
		System.out.println("Private access Specifier");
		
	}
	

}


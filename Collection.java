package javafirstTask.come;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<Integer> number=new ArrayList<Integer>();   
	      number.add(1);//
	      number.add(11);    	   
	      System.out.println(number);  


	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<String> name = new Vector();
	      name.addElement("rocky"); 
	      name.addElement("rebal"); 
	      System.out.println(name);
	      for(String nam:name)
	    	  System.out.print(nam+" ");


	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("prbha");  
	      names.add("yash");  	
	      names.add("ram");
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  }
	      System.out.println(names);


	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(201);  
	       set.add(204);  
	       set.add(202);
	       set.add(203);
	       set.add(200);
	       System.out.println(set);


	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(61);  
	       set2.add(23);  
	       set2.add(32);
	       set2.add(54);
	       set2.add(10);
	       System.out.println(set2);
	      	} 


}


	



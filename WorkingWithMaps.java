package javafirstTask.come;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class WorkingWithMaps {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"jagadeesh");    
	      hm.put(2,"prabha");    
	      hm.put(3,"yash");   

	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }



	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  

	      ht.put(4,"ram");  
	      ht.put(5,"kriss");  
	      ht.put(6,"sandeep");  
	      ht.put(7,"rrr");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }





	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"nag");    
	      map.put(9,"sanddy");    
	      map.put(10,"king");       

	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      } 


	}

}




	import java.util.*;
public class UsingMap {
	public static void main(String[] args) {
			
					//Hashmap
					HashMap<Integer,String> hm=new HashMap<Integer,String>();      
				      hm.put(1,"rama");    
				      hm.put(2,"ravana");    
				      hm.put(3,"seeta");   
				       
				      System.out.println("\nThe elements of Hashmap are ");  
				      for(Map.Entry m:hm.entrySet()){    
				       System.out.println(m.getKey()+" "+m.getValue());    
				      }
				      
				     //HashTable
				       
				      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
				      
				      ht.put(4,"raja");  
				      ht.put(5,"rani");  
				      ht.put(6,"sevaki");  
				      ht.put(7,"sevaka");  

				      System.out.println("\nThe elements of HashTable are ");  
				      for(Map.Entry n:ht.entrySet()){    
				       System.out.println(n.getKey()+" "+n.getValue());    
				      }
				      
				      
				      //TreeMap
				      
				      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
				      map.put(8,"ramya");    
				      map.put(9,"bhavya");    
				      map.put(10,"navya");       
				      
				      System.out.println("\nThe elements of TreeMap are ");  
				      for(Map.Entry l:map.entrySet()){    
				       System.out.println(l.getKey()+" "+l.getValue());    
				      }    
				      
				   }  
}

	




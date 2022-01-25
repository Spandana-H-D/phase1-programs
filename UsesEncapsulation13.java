

public class UsesEncapsulation13 {
	    private String Name; 
	    private int USN; 
	    private int Age;
	    public int getAge()  
	    { 
	      return Age; 
	    } 
	    public String getName()  
	    { 
	      return Name; 
	    } 
	    public int getUSN()  
	    { 
	       return USN; 
	    } 
	    public void setAge( int newAge) 
	    { 
	      Age = newAge; 
	    } 
	    public void setName(String newName) 
	    { 
	      Name = newName; 
	    } 
	    public void setUSN( int newUSN)  
	    { 
	      USN = newUSN; 
	    } 
	
	    public static void main (String[] args)  
	    { 
	        UsesEncapsulation13 obj = new UsesEncapsulation13(); 
	        obj.setName("Niveditha"); 
	        obj.setAge(25); 
	        obj.setUSN(37); 
	        System.out.println("My name: " + obj.getName()); 
	        System.out.println("My age: " + obj.getAge()); 
	        System.out.println("My USN: " + obj.getUSN());      
	    } 
}
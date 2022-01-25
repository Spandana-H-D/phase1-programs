

	public class innerclassassisted {

		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			innerclassassisted obj=new innerclassassisted();
			innerclassassisted.Inner in=obj.new Inner();  
			in.hello(); 
			
			innerclassassisted1  ob=new innerclassassisted1 ();  
			ob.display();
		}
	}


	 class innerclassassisted1 {

	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  
	}



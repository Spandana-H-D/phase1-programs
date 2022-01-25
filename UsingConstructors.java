

 class UsingConstructors {
	//default constructor
	
		int id;
		String name;

	void display() {
		System.out.println(id+" "+name);
		
		}
  
	public static void main(String[] args) {
		
			UsingConstructors emp1=new UsingConstructors();
			UsingConstructors emp2=new UsingConstructors();

			emp1.display();
			emp2.display();
			Std std1=new Std(4,"raja");
			Std std2=new Std(10,"rani");
			std1.display();
			std2.display();
			}
		}
 
		//parameterized constructor
		class Std{
			int id;
			String name;

			Std(int i,String n)
			{
			id=i;
			name=n;
			}

			void display() {
			System.out.println(id+" "+name);
			}
	}



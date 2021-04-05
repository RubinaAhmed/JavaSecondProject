package variables;

public class LocalVariables {

	public static void main(String[] args) {
		age(); 
		name();
		salary();
		
	}
	private static void salary() {
		// TODO Auto-generated method stub
		
	}
	//to declare a variable i need data type, VARIABLE (name for the variable), an operator and a value. 
	//name, operator and value is needed for a variable. 
	//you can also create a variable without a value and operator.
	//Every time u creating a value, it gets stored in the memory, heap memory and stack memory. 

	public static void age() {
		//variable is a place holder.
	final int age=23;
	System.out.println(age);
		
	//int is a data type and you must declare data type for  variable
	//faruq is the name of the variable, and it is also a MUST addition meaning it must have a name for variable.
	//=is a operator
	
	//20 is the value of the variable.
	//local variable must declare the value.	
	//scope of the local variable in only inside the method.
	//local variable can not have any other modifier than any other modifier but final.
	
	int chocolate=5;
	int soda=5;
	int total= chocolate+soda;
	System.out.println(total);
	int fromhome=20;
	int Return=fromhome-total;
	System.out.println(Return);
			
			
	
	
	}
	
	public static void name() {
		String fname="Faruq";
		String lname="Molla";
		String fullName=fname+" "+lname;
		System.out.println(fullName);
		
		//concatenation is use for string operator, puts it together. 
		
		 
	}
	
	
	
	
	
}

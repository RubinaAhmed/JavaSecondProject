package variables;

public class InstanceVariable {
   String name;
   int age;
   
   /*scope= inside the class but outside of the method as a results variables are common
    * for all the methods
    * common variable. and use again and again then we declare instance.
    * instance variable must declare data type
    * must declare name               
    * instance variable does not have to declare value
    * if you do not declare value then it takes the default value    
    * instance variable can take any modifier.
    * Static and Instance variable is inside the class but outside of the method. the only way to make it static just use static.                         
    * local variable is outside of the class but inside the method.         
	*/
	

	public static void main(String[] args) {
		InstanceVariable ins = new InstanceVariable();
		ins.name();
		ins.age ();
		
		
	}

	public void name() {
		name="faruq";
		System.out.println(name);	
	}
	
	public void age() {
		name="Sajid";
	System.out.println(name);
		
		System.out.println(age);	
	}
	
}

package simple_programs;

public class Variable_Types4 {
	static int m=50;//static variable
	//This method does not return any thing
	void method() {
		int n=90;//local variable
		//this method does not print, because it is outside of the main method
		System.out.println("The local variable value is:- "+n);
	}
	public static void main(String[] args) {
		int data=50;//instance variable
		
		//Printing different variable values as a output
		System.out.println("The static variable value is:- "+m);
		System.out.println("The instance variable value is:- "+data);
		
		//The "n" value is not accessed inside the main(), because it is accessible only inside the method only
		//System.out.println("The local variable value is:- "+n);//It shows error,because it is local variable.
		//Uncomment the above line to see the error
	}
	
	
}

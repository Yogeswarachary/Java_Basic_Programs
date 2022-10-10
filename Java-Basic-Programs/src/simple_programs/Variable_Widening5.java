package simple_programs;

public class Variable_Widening5 {
	public static void main(String[] args) {
		//widening means converting number from higher data type to lower data type
		int a=10;
		float f=a;
		System.out.println("The 'a' value is "+a);
		System.out.println("After widening of 'a' value is:- "+f);
	}
}

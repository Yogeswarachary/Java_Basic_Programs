package simple_programs;

public class Variable_Overflow7 {
	public static void main(String[] args) {
		int a=130;
		//The maximum number of byte data type is 127 only. so output is less than the 130
		byte b = (byte)a;
		System.out.println("The value of 'a' is:- "+a);
		System.out.println("The value of 'b' is:- "+b);
	}
}

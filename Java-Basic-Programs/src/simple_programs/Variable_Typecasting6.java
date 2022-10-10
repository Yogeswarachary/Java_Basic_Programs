package simple_programs;

public class Variable_Typecasting6 {
	public static void main(String[] args) {
		float f=10.4f;
		//int a=f;//it will give compilation error
		int a=(int)f;
		System.out.println("The 'f' value is:- "+f);
		System.out.println("The 'a' value is:- "+a);
	}
}

package simple_programs;

import java.util.Scanner;

public class Enter_Your_Name_Prog2 {
	public static void main(String[] args) {
		//importing scanner for the requesting the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:- ");
		String name = sc.next();
		System.out.println("Your name is "+name);
	}
}

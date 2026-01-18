package Assigment;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		//Password length check
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Password : ");
		String pass = sc.nextLine();
		
		if(pass.length()>=8) {
			System.out.println("Strong Password");
		}
		else {
			System.out.println("Weak password");
		}
		
		sc.close();
	}

}

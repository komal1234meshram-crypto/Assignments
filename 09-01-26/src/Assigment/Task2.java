package Assigment;
import java.util.Scanner;


public class Task2 {
	//number sign checker
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
			
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		else if(num == 0){
			System.out.println("Zero");
		}
		else {
			System.out.println("Invalid");
		}
		
		sc.close();
		
	}

}

package Assigment;
import java.util.Scanner;

public class Task1 {
	//Office Entry eligibility
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter time : ");
		int time = sc.nextInt();
		
		if(time<=9) {
			System.out.println("Allowed");
		}
		else {
			System.out.println("Late Entry");
		}
		
		sc.close();
		
	}

}

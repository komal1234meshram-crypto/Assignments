package Assigment;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		//print n natural number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers from 1 to n : ");
		int num= sc.nextInt();

		


		for(int i=1; i<=num; i++) {
			System.out.println(i+" ");
			
		}

		sc.close();
	}

}

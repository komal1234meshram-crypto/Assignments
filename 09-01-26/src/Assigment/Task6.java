package Assigment;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// Employee Performance rating
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your score : ");
		int score = sc.nextInt();
		
		if(score>=75) {
			System.out.println("EXCELLENT");
		}
		else if(score>=50 && score<=74) {
			System.out.println("GOOD");
		}
		else if(score<50) {
			System.out.println("NEED IMPROVEMENT");
		}
		

		sc.close();
	}

}

package Assigment;
import java. util.Scanner;


public class Task3 {

	public static void main(String[] args) {
		//Day Type Identifier
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day num between 1 t 7 :");
		int num=sc.nextInt();
		

		if(num==1) {
			System.out.println("monday");
			System.out.println("Working Day");
		}
		else if(num==2) {
			System.out.println("tuesday");
			System.out.println("Working Day");
		}
		else if(num==3) {
			System.out.println("thusday");
			System.out.println("Working Day");
		}
		else if(num==4) {
			System.out.println("thusday");
			System.out.println("Working Day");
		}
		else if(num==5) {
			System.out.println("thusday");
			System.out.println("Working Day");
		}
		else if(num==6) {
			System.out.println("Saturday");
			System.out.println("WEEKEND");
		}
		else if(num==6) {
			System.out.println("Sunday");
			System.out.println("WEEKEND");
		}
		
		sc.close();
	}

}

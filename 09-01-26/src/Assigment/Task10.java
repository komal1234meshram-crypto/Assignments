package Assigment;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
    	//electricity bill
    	
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        
        int bill = 0;

        if (units <= 100) {
            System.out.println(bill = units * 5);
        } 
        else if (units <= 200) {
        	 System.out.println(bill = (100 * 5) + (units - 100) * 7);
        } 
        else {
        	 System.out.println(bill = (100 * 5) + (100 * 7) + (units - 200) * 10);
        }

       
        sc.close();
    }
}
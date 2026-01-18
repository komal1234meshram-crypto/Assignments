package Assigment;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// ATM Withdrawal Simulation
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your balance : ");
		int balance = sc.nextInt();
		
		System.out.println("enter your withdrawal amount : ");
		int withdrawal = sc.nextInt();
		
		if(withdrawal*100!=0) {
			System.out.println("INVALID AMOUNT");
		}
		else if(balance<withdrawal) {
			System.out.println("INSUFICIANT BALANCE");
		}
		else {
			System.out.println("WITHDRAWAL SUCESSFULL");
		}
		
		sc.close();

	}

}

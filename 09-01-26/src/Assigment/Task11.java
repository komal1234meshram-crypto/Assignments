package Assigment;
import java.util.Scanner;

public class Task11{
    public static void main(String[] args) {
    	//password checker
    	
        Scanner sc = new Scanner(System.in);

        int Pass= 1234;
        boolean isLoggedIn = false;

        for (int i = 1; i <= 3; i++) {
            int userenteredPass = sc.nextInt();

            if (userenteredPass == Pass) {
                System.out.println("LOGIN SUCCESSFUL");
                isLoggedIn = true;
                break;
            }
        }

        if (!isLoggedIn) {
            System.out.println("ACCOUNT LOCKED");
        }

        sc.close();
    }
}
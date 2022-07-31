package NewProject;

import java.util.Scanner;

public class EvenNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the num");
     //int num = 32;
	
	int num = scanner.nextInt();
     
     if(num%2 == 0) {
    	 System.out.println("Even Num");
     }else
     
     {System.out.println("Odd Num");
     
     }
     
	}

}

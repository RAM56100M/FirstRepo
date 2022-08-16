package interviewque;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int sum=0;
		int temp=0;
		 temp=x;
		
		while (x>0) {
			
			int rev=x%10;
			sum=(sum*10)+rev;
			x=x/10;
		}
		if(temp==sum) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
		
		sc.close();
	}

}

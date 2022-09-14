package ArrayPrograms;

public class PalindromeNumber {
public static void main(String[] args) {
	int num=1111112;
	int rev=0;
	int n;
	n=num;
	while(n>0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}if(rev==num) {
		System.out.println("number is palindrome");
	}
	else {
		System.out.println("Number is not palindrome");
	}
}
}

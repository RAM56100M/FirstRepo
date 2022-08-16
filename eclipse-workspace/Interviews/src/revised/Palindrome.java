package revised;

public class Palindrome {

	public static void main(String[] args) {
		int n=151;
		int temp=n;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;//1//5//0
			sum=(sum*10)+rem;//1//150+1=151
			temp=temp/10;//15//1
		}
		if(sum==n) {
			System.out.println("palindrome");}
		else System.out.println("not palindrome");
		}
	}



package revised;

public class Palindrome1 {

	public static void main(String[] args) {
		int num=151;
		int temp=0;
		temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
		sum=(sum*10)+rem;//
			temp=temp/10;
			}
		if (sum==num) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}

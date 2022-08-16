package interviewque;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int n=45678;
		int rev=0;
		while (n!=0){
			int digit= n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
			
		}
	}


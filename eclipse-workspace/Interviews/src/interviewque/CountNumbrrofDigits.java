package interviewque;

public class CountNumbrrofDigits {

	public static void main(String[] args) {
		int num=70996;
		int count=0;
		for(int i=0;i<=num;i++) {
			num=num/10;
			count++;
		}
		System.out.println("Total number of count is:"+count);
	}

}

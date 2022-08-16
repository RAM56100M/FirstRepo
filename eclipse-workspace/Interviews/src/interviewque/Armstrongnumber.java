package interviewque;

public class Armstrongnumber {

	public static void main(String[] args) {
	int num=153;
	int temp;
	temp=num;
	int result=0;
	while(temp>0) {
		int rem=temp%10;
		result=result+rem*rem*rem;
		temp=temp/10;
		}
		if(num==result) {
			System.out.println("number is armstrong");
		}else
		{System.out.println("number is not armstrong");
		
	}
	
	}}
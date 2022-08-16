package interviewque;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=456789;
		
		//Usinng Algorithm
		int rev=0;
		//while(num!=0) {
			rev=rev*10 +num%10;
			num=num/10;
			//StringBuffer Method
			StringBuffer sb=new StringBuffer(String.valueOf(num));
			StringBuffer reverse=sb.reverse();
			System.out.println(reverse);
			
			//StringBuilder Method
			StringBuilder sbi= new StringBuilder();
			sbi.append(num);
			sbi.reverse();
			System.out.println(sbi);
		}
		
		//System.out.println(rev);
	}



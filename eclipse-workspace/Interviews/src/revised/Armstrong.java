package revised;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int temp;
		temp=n;
		int cube=0;
		while(temp>0) {
			int rem=temp%10;
			cube=cube+rem*rem*rem;
			temp=temp/10;
		}if(n==cube) {
			System.out.println("armstrong");}
		else System.out.println("not armstrong");
		}
	}



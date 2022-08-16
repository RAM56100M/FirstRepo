package revised;

public class Armstrong2 {
	public static void main(String[] args) {
		int n=153;
		int cube=0;
		int temp;
		temp=n;
		while(temp>0) {
			int rem= temp%10;
			cube=cube+rem*rem*rem;
			temp=temp/10;
		}if(cube==n) 
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	}
}

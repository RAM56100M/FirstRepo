package revised;

public class Fibonacci1 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		for(int i=0;i<=6;i++) {
		int	sum=a+b;
		System.out.println(sum);
			a=b;
			b=sum;
		}
	}
}

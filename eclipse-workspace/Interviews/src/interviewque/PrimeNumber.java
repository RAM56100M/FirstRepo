package interviewque;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=5;
		int temp=0;
		for (int i=2;i<=num-1;i++) {
			if (num%i==0){
				temp=temp+1;
			}	
			}
			if (temp==0) {
				System.out.println(num+"is prime");
			}else {
				System.out.println(num+"is not prime");
			}
		}
			}

		


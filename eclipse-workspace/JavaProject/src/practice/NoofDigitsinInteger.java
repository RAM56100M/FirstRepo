package practice;

public class NoofDigitsinInteger {

	public static void main(String[] args) {
		int count=0; int n=1122334455;
		while(n!=0){
			n=n/10;
			count++;
					}
			System.out.println(count);	
	}

}

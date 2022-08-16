package revised;

public class Armstrong1 {

	public static void main(String[] args) {
		int num=153;
		int temp;
		temp=num ;
		int result=0; 
		while(temp>0) {
			int rem=temp%10;
			result=result+rem*rem*rem;
			temp=temp/10;
		}
			if(result==num) {
				System.out.println("armstrong");
			}else {
				System.out.println("not Armstrong");
			}
		}
	
	
}



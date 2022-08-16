package revised;

public class primeNumber {

	public static void main(String[] args) {
		int t=11;
		int temp=0;
		for(int i=2;i<=t-1;i++) {
			if(t%i==0){
				temp=temp+1;
			}
		}
			
			if	(temp==0)
				{System.out.println("prime");
				}
			
				
				
				else {
					System.out.println("not prime");
				}
			}
		}
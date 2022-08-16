package interviewque;

public class Swapping2Numbers {
	public static void main(String[] args) {
		
	
	int a=13;
	int b=14;
	int c;
	//by using 3rd variable
	 c=a;
	 a=b;
	 b=c;
	 System.out.println(a);
	 System.out.println(b);
	 //without using 3rd variable
	 int sum=a+b;
	 a=sum-b;
	 b=sum-a;

	 System.out.println(a);
	 System.out.println(b);
	 int mul=a*b;
	 a=mul/b;
	 b=mul/a;
	 
	 System.out.println(a);
	 System.out.println(b);
	
	}
}

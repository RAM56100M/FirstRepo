package revised;

public class swappingNumbers {

	public static void main(String[] args) {
		int a=4;
		int b=9;
		//int sum=a+b;
		//a=sum-a;
		//b=sum-a;
		int mul=a*b;
		a=mul/a;
		b=mul/a;
		System.out.println("value of a after swapping "+a);
		System.out.println("value of a after swapping "+b);
	}

}

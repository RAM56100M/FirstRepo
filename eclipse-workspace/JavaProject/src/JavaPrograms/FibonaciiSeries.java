package JavaPrograms;

public class FibonaciiSeries {
public static void main(String[] args) {
	

	int n1=0;
	int n2=1;
	int n=10;
	for(int i=0;i<n;i++) {
		int next=n1+n2;
		n1=n2;
		n2=next;
		System.out.println(next);	
	}
}
}
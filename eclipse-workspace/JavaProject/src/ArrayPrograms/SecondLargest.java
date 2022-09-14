package ArrayPrograms;

public class SecondLargest {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6,7};
	int max = a[1];
	for(int i=0;i<a.length;i++) {
		if(max <a[i])
			max=a[i];}
	System.out.println(max);
}
}

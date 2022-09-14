package ArrayPrograms;

public class SmallestLargest {
	public static void main(String[] args) {
		
	int[] a = {1, 5, 15, 225, 256 };
	int max = a[0];
	for(int i=0;i<a.length;i++) {
		if(a[0] <a[i])
			max=a[i];}
	System.out.println(max);
		}
}

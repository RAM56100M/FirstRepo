package ArrayPrograms;

public class SmallestinArray {
public static void main(String[] args) {
	int [] a= {5,8,7,995,4,7,88,4,445,7,4,5,55,744,5,745,5,555,4};
	int small=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<small) {
			small=a[i];
		}
	}System.out.println(small);
}
}

package revised;

public class maxMinNumberinArr {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,78};
		int length=a.length;
		int max=a[0];
		for(int i=0;i<=length-1;i++) {
			if(a[i]>max)
				max=a[i];}
			System.out.println(max);
		int min=a[0];
			for(int j=0;j<=length-1;j++) {
				if(a[j]<min)
				a[j]=min;
				
			
		}
		System.out.println(min);
	}
	}


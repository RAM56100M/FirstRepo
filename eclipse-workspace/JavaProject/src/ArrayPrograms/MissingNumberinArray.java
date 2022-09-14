package ArrayPrograms;

public class MissingNumberinArray {
public static void main(String[] args) {
	int []	a=	{8,15,21,24,30,37};
	System.out.println("missing numbers in an array");
	for	(int i=0;i<a.length-1;i++	)
	{
	for (int j=a[i]+1;j<a[i+1];j++	)
	{
	System.out.println	(j);
	}
	}
	
	}
}


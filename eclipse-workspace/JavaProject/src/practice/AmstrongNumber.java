package practice;

public class AmstrongNumber {
public static void main(String[] args) {
	int num=1534;
	int cube=0;
	int temp;
	temp=num;
	while(num!=0) {
		int rem=num%10;
		cube=cube+rem*rem*rem;
		num=num/10;
			}
	if(cube==temp) {
		System.out.println("Amstrong number");
	}else {
		System.out.println("not amstrong");
	}
}
}

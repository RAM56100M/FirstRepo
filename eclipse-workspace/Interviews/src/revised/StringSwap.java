package revised;

public class StringSwap {

	public static void main(String[] args) {
		String s1="ram";
		String s2="marshivane";
		String s=s1+s2;
		s2=s.substring(0, s.length()-s2.length());
		System.out.println("s2 after  swapping "+s2);
		s1=s.substring(s1.length());
		System.out.println("s1 after swapping "+s1);
	}
}

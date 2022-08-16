package interviewque;

public class StringSwap {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Marshivane";
		String s=s1+s2;
		s2=s.substring(0, s.length()-s2.length());
	
		s1=s.substring(s2.length());
		System.out.println("value of s1 after swapping is " +s1);
		System.out.println("value of s2 after swapping is " +s2);
	
	
	}

}

package interviewque;

public class PalindromeString {

	public static void main(String[] args) {
		String s="lol";
		int l=s.length();
		String rev=""; 
		
		for(int i=l-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("string is palindrome");
			
		}else {
			System.out.println("string is not palindrome");
		}
	}

}

package revised;

public class StringRev1 {
	public static void main(String[] args) {
		String s="marshivane";
		int length=s.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}System.out.println(rev);
	}
}

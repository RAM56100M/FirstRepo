package stringPrograms;

public class StringReverse {
public static void main(String[] args) {
	String s="Marshivane";
	int length =s.length();
	String rev="";
	for(int i=length-1;i>=0;i--) {
		rev = rev+s.charAt(i);
	}System.out.println(rev);
}
}

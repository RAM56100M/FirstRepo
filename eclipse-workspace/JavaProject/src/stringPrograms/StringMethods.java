package stringPrograms;

public class StringMethods {
public static void main(String[] args) {
	String s=" Marshivane Ram Venkatrao ";
	String z="Te$!ng $h@str@";
	System.out.println(z.replaceAll("[^a-zA-Z0-9]","X"));
	
System.out.println(s.charAt(5));
System.out.println(s.length());
System.out.println(s.toCharArray());
System.out.println(s.toUpperCase());
System.out.println(s.trim() );
StringBuffer sb= new StringBuffer(s);
System.out.println(sb.reverse());



}
}

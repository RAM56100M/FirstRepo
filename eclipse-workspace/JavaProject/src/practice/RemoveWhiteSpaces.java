package practice;

public class RemoveWhiteSpaces {
public static void main(String[] args) {
	String s=" abc def ghi";
	String s1=s.replaceAll("\\s","");
	System.out.println(s1);
}
}

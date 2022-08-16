package interviewque;

public class removeWhiteSpaces {

	public static void main(String[] args) {
String str="ram       marshi                   vane venkatrao";
str=str.replaceAll("\\s", "");
System.out.println(str);
}

}

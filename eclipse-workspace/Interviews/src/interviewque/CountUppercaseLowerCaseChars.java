package interviewque;

public class CountUppercaseLowerCaseChars {

	public static void main(String[] args) {
		String str1 = "RamMarSHiVANe";
	      int upperCase = 0;
	      int lowerCase = 0;
	      char[] ch = str1.toCharArray();
	      for(char chh : ch) {
	         if(chh >='A' && chh <='Z') {
	            upperCase++;
	         } else if (chh >= 'a' && chh <= 'z') {
	            lowerCase++;
	         } else {
	            continue;
	         }
	      }
	      System.out.println("Count of Uppercase letter/s is/are " + upperCase);
	      System.out.println( "Count of Lowercase letter/s is/are " + lowerCase);
	}

}

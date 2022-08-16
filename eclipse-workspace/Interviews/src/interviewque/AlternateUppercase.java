package interviewque;

public class AlternateUppercase {

	public static void main(String[] args) {
		String str = "MARSHIVANE";
	      str = str.toLowerCase();
	      char[] ch = str.toCharArray();
	      for(int i=0; i<ch.length; i=i+2){
	         ch[i] = Character.toUpperCase(ch[i]);
	      }
	      System.out.println((ch));
	   }
	}
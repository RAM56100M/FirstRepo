package revised;

public class AlternateUppercase {

	public static void main(String[] args) {
		String s="RAMMARSHIVANE";
		 s=s.toLowerCase();
		char[] s3=s.toCharArray();
		for(int i=0;i<s3.length;i=i+2) {
			s3[i] =Character.toUpperCase(s3[i] );
			
		}System.out.println(s3);
	}
//	String str = "MARSHIVANE";
//    str = str.toLowerCase();
//    char[] ch = str.toCharArray();
//    for(int i=0; i<ch.length; i=i+2){
//       ch[i] = Character.toUpperCase(ch[i]);
}

package interviewque;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String s="AABBCSSTTTTTTUUUUUU";
		String st=" ";
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch!=' ') {
				st=st+ch;
				s=s.replace(ch,' ');
				
					
				}
			}System.out.println("new word is" +st);
	}

}

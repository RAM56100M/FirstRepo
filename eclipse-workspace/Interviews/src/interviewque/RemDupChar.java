package interviewque;
//					USING LINKEDHASHSET
import java.util.LinkedHashSet;
import java.util.Set;

public class RemDupChar {

	public static void main(String[] args) {
		String s="coconut";
		Set<Character> set= new LinkedHashSet<Character>();
		for (int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		StringBuffer sb= new StringBuffer();
		for (Character c: set) {
			
		sb.append(c);
		
	}
		System.out.println(sb);
	}

}

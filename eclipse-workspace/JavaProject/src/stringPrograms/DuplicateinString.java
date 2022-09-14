package stringPrograms;

public class DuplicateinString {
public static void main(String[] args) {
	String [] s= {"ram", "Lakhan", "ram","ram","Lakhan","marshivane"};
	int length=s.length;
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(s[i].equals(s[j])) {
				System.out.println(s[i]);
			}
		}
		
	}
}
}

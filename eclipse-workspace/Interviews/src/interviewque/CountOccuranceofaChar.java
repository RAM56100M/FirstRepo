package interviewque;

public class CountOccuranceofaChar {

	public static void main(String[] args) {
		String s="marshivane ram";
		int totallength=s.length();
		System.out.println(totallength);
		int lengthaftera= s.replace("a","").length();
		System.out.println(lengthaftera);
		int count=totallength-lengthaftera;
		System.out.println("number of occurance of a is: " +count);
		
	}

}

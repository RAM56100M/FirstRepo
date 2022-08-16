package interviewque;

public class removespecialchar {

	public static void main(String[] args) {
		String s="gagdg7^4@%hAJsos87shs";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}

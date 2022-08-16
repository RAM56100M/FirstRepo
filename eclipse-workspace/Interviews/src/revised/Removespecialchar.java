package revised;

public class Removespecialchar {

	public static void main(String[] args) {
		String s="ram@#$665$%MARSHIVANE";
		int length=s.length();
		s=s.replaceAll("[^a-zA-Z1-9]","");
		System.out.println(s);
	}

}

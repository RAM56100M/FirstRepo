package revised;

public class CountUpperLowerChars {

	public static void main(String[] args) {
		String s = "RAM12marshiVANE@gmail com";
		int Uppercase = 0;
		int lowercase = 0;
		//for (int i = 0; i <= s.length(); i++) {
			char[] ch = s.toCharArray();
			{
				for (char chh : ch) {
					if (chh >= 'a' && chh <= 'z') {
						Uppercase++;
					} else if (chh >= 'A' && chh <= 'Z') {
						lowercase++;
					} else {
						continue;
					}
				}
				System.out.println(lowercase);
				System.out.println(Uppercase);

			}
		

	}
}

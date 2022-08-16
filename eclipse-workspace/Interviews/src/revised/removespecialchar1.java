package revised;

public class removespecialchar1 {
	public static void main(String[] args) {
		String s="RS^S$3^c8HCus*HS**sid(CS)(C";
		String s1=s.replaceAll("[^a-zA-Z1-9]","");
				System.out.println(s1);
	}
}

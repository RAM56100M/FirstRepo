package practice;

public class Vovelorconsonent {
public static void main(String[] args) {
	char ch='e';
	if(ch=='a' ||ch=='e' ||ch== 'i' || ch=='o' ||ch== 'u') {
System.out.println("given character is vovel");
	}
	else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
		System.out.println("character is consonent");
	}
	else {
		System.out.println("none of these");
	}
}
}

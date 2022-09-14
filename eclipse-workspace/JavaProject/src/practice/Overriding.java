package practice;

public class Overriding {
	public void barking() {
		System.out.println("dog is barking");
	}
}
 class MethodOverRiding extends Overriding {
	public void barking() {
		System.out.println("dog is not barking");
	 }
	class test{
		public  void main(String[] args) {
			Overriding o=new MethodOverRiding();
o.barking();		}
	}
}
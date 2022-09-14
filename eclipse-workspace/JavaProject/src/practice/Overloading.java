package practice;

public class Overloading {
		public static int m1(int a, int b) {
			return a+b;
		}
		public static int m1(int a, int b, int c) {
			return a+b+c;
		}
		public static void main(String[] args) {
			System.out.println(Overloading.m1(2, 5));
		}
	}


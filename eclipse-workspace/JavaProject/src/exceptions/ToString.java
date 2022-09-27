package exceptions;

public class ToString {
	//program to print the exception information using toString() method

	import java.io.*;

	class GFG1 {
		public static void main (String[] args) {
		int a=5;
		int b=0;
			try{
			System.out.println(a/b);
			}
		catch(ArithmeticException e){
			System.out.println(e.toString());
		}
		}
	}

}

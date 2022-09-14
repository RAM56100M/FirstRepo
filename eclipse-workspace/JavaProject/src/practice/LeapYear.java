package practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class LeapYear {
  @Test
  public void LeapYear() {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter year");
	  int year= sc.nextInt();
	  if(year%4==0) {
		  System.out.println(year+"is leap Year");}
		  else if (year%400==0) {
			  System.out.println(year+"is leap Year");

		  }else {
			  System.out.println("Not a leap Year");
	  }
  }
}

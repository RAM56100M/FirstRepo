package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
  @Test
  @Parameters("Smoke")
  public void f(String s) {
	  System.out.println("test running of :"+ s);
  }
}

package testNG;

import org.testng.annotations.Test;

public class TimeOut {
  @Test
  public void Apple() {
	  System.out.println("This is pinapple");
  }
  @Test
  public void mango() {
	  System.out.println("This is mango");
  }
  @Test(timeOut=4000)
  public void banana() throws InterruptedException {
	  System.out.println("This is banana");
	  Thread.sleep(5000);
  }
}

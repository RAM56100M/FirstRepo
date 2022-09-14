import org.testng.Assert;
import org.testng.annotations.Test;

public class TimeOut {
	 @Test (timeOut=3000)
	  public void Pomigranete() throws InterruptedException {
		  System.out.println("Pomigranete");
		  Thread.sleep(4000);
	  }
	  @Test (enabled=false)
	  public void Lemon() {
		  System.out.println("lemon");
		 // Assert.assertTrue(false);
	  }
	  @Test (enabled=false)
	  public void Apple() {
		  System.out.println("Apple");
		  Assert.assertTrue(false);

	  }
}

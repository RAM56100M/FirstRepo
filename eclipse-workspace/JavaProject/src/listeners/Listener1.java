package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.listener.class)
public class Listener1 {
  @Test
  (priority=0)
  public void m1() {
  System.out.println("Method 1 is passed");
  }
  @Test(priority=1)
  public void m2() {
  System.out.println("Method 1 is Failed");
  Assert.assertFalse(true);
  }
  @Test(dependsOnMethods="m2")
  public void m3() {
  System.out.println("Method 1 is Skipped");
  }
}

package groups;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test(dependsOnMethods={"Lemon","Apple"})
  public void Pomigranete() {
	  System.out.println("Pomigranete");
  }
  @Test 
  public void Lemon() {
	  System.out.println("lemon");
	 // Assert.assertTrue(false);
  }
  @Test
  public void Apple() {
	  System.out.println("Apple");
	 // Assert.assertTrue(false);

  }
}

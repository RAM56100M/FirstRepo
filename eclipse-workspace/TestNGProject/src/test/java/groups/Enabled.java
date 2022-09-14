package groups;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Enabled {
	 @Test
	  public void Pomigranete() {
		  System.out.println("Pomigranete");
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

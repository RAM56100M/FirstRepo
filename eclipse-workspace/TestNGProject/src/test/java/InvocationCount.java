import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCount {
	 @Test(dependsOnMethods={"Lemon"})
	  public void Pomigranete() {
		  System.out.println("Pomigranete");
	  }
	  @Test (invocationCount=4,description="this is test cases")
	  public void Lemon() {
		  System.out.println("lemon");
		 // Assert.assertTrue(false);
	  }
	  @Test
	  public void Apple() {
		  System.out.println("Apple");
		  Assert.assertTrue(false);

	  }
}

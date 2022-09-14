package groups;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AssertionsPriority {
  @Test (priority=2,groups="sanity")
  public void Pomigranete() {
	  System.out.println("Pomigranete");
  }
  @Test(priority=1,groups="sanity")
  public void lemon() {
	  System.out.println("lemon");
  }
  @Test(priority=-3,groups="smoke")
  public void apple() {
	  System.out.println("Apple");
  }
}

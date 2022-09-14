import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTestClass {
  @Test
  public void TestCase1() {
	System.out.println("sample test case");  
  }
  @BeforeSuite
  public void initBrowser() {
	  
  }
}

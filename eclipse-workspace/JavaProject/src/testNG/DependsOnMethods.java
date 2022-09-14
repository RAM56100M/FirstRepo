package testNG;
import static org.testng.Assert.fail;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test(priority=1)
  public void apple() {
	  System.out.println("this is apple method");
  }
  @Test(priority=-400,dependsOnMethods="apple")
  public void mango(){
	  System.out.println("this is mango");
	  
  }
  @Test(priority=2)
  public void pineapple()
  {
  System.out.println("Fruit is Pineapple");
  
  }
  @Test(dependsOnMethods="pineapple",priority=3 )
  public void custardapple()
  {
  System.out.println("Fruit is Custardapple");
  }
}

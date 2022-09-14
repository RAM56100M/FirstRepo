package testNG;

import org.testng.annotations.Test;

public class Discription {
  @Test
 (priority=1)
  public void apple()
  {
  System.out.println("Fruit is Apple");
  }
  @Test(priority=2,description="This is second test case")
  public void pineapple()
  {
  System.out.println("Fruit is Pineapple");
  }
  @Test(priority=3, description="This is third test case")
  public void custardapple()
  {
  System.out.println("Fruit is Custardapple");
  }
}

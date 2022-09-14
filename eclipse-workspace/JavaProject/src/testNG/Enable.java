package testNG;

import org.testng.annotations.Test;

public class Enable {
  @Test
 (priority=1)
  public void apple()
  {
  System.out.println("Fruit is Apple");
  }
  @Test(priority=2, enabled=false)
  public void pineapple()
  {
  System.out.println("Fruit is Pineapple");
  }
  @Test(priority=3 )
  public void custardapple()
  {
 
  System.out.println("Fruit is Custardapple");
  }
}

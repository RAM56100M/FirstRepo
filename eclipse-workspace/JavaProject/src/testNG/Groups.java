package testNG;

import org.testng.annotations.Test;

public class Groups {
  @Test
  (groups="Sanity",priority=3)
  public void apple()
  {
  System.out.println("Fruit is apple");
  }
  
 @Test(groups="Regression",priority=1)
 public void pineapple()
 {
 System.out.println("Fruit is pineapple");
 }
 @Test(groups="Sanity",priority=1)
 public void custardapple()
 {
 System.out.println("Fruit is custardapple");
 }
 @Test(groups="Regression",priority=2)
 public void mango()
 {
 System.out.println("Fruit is Mango");
 }
 @Test(groups="Sanity",priority=2)
 public void banana()
 {
 System.out.println("Fruit is banana");
 }
}

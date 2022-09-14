package testNG;

import org.testng.annotations.Test;

public class Prioriti {
	@Test(priority=2)
	public void apple()
	{
	System.out.println("Fruit is Apple");
	}
	@Test(priority=-1)
	public void pineapple()
	{
	System.out.println("Fruit is Pineapple");
	}
	@Test(priority=0)
	public void custardapple()
	{
	System.out.println("Fruit is Custardapple");
	}

}

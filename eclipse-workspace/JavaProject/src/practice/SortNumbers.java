package practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortNumbers {
  @Test
  public void sorting() {
	  int[] arr= {1,4,8,9,6,2,5,7,8,6,4,88,6,5,55,4,7,7,99,6,895};
	  Arrays.sort(arr);
	  System.out.println(Arrays.toString(arr));
  }
}

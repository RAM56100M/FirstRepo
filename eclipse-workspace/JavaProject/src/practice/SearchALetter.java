package practice;

import org.testng.annotations.Test;

public class SearchALetter {
  @Test
  public void LetterSearching() {
	  String s="Ram Marshivane";
	  int index=s.indexOf("r");
	  System.out.println(index);
  }
}

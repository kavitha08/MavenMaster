package edurekaAssingment;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class edureka {
  @Test
  public void f() {
	  
	  System.out.println("test");
	  System.out.println("first test");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after");
  }

}

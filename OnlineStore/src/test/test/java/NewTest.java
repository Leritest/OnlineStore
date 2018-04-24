package test.test.java;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println();
	  for(int i=1; i<=10; i++)
	  System.out.println("This is great test " +i);
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println();
	  System.out.println("Before test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println();
	  System.out.println("after test");
	  System.out.println();
  }

}

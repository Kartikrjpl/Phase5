package Day4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Priority {
  @Test(priority = 0)
  public void e_test() {
	  System.out.println("a_test");
  }
  
  @Test(priority = 1)
  public void b_test() {
	  System.out.println("b_test");
  }
  
  @Test
  public void c_test() {
	  System.out.println("c_test");
  }
  
  @Test
  public void d_test() {
	  System.out.println("d_test");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  
}

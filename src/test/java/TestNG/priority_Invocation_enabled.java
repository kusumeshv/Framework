package TestNG;

import org.testng.annotations.Test;

public class priority_Invocation_enabled 
{
  @Test (priority=1, invocationCount=2, enabled=true)
    public void demo1()
  {
	  System.out.println("Hi Demo1");
  }
  @Test (priority=1, invocationCount=5)
  public void demo2()
{
	  System.out.println("Hi Demo2");
}
  @Test (priority=1, invocationCount=0, enabled=true)
  public void demo3()
{
	  System.out.println("Hi Demo3");
}
}

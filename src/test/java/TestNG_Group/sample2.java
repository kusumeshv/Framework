package TestNG_Group;

import org.testng.annotations.Test;

public class sample2 
{
	   @Test(groups="smoke")
	   public void demo3()
	   {
		   System.out.println("Demo3");
	   }
	   @Test
	   public void demo4()
	   {
		   System.out.println("Demo4");
	   }
	}


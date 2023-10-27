package TestNG_Group;

import org.testng.annotations.Test;

public class sample3 
{
	@Test
	   public void demo5()
	   {
		   System.out.println("Demo5");
	   }
	   @Test(groups="smoke")
	   public void demo6()
	   {
		   System.out.println("Demo6");
	   }
	}


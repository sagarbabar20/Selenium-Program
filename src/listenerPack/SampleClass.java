package listenerPack;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerPack.Listener.class)
public class SampleClass 
{
@Test
public void testA()
{
	System.out.println("test-A");
	Assert.assertTrue(true);
}
	
@Test
public void testB()
{
	System.out.println("test-B");
	Assert.assertTrue(false);

}
}

package listenerPack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is successfully passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case is failed hence taking a screenshot");
	}

}

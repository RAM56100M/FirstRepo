package iTestListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementingClasss extends LoginPage implements ITestListener {
Screenshot ref;

	public void onTestStart(ITestResult result) {
		System.out.println("On test Start");
}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On test Success");
}

	public void onTestFailure(ITestResult result) {
		System.out.println("On test Failure");
		//String name=result.getName();
		
		 ref=new Screenshot();
		 
		 try {
			ref.captureScreen(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On test Skipped");
}
}

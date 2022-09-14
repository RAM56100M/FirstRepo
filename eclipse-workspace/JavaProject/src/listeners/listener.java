package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class listener implements ITestListener {
	@Test
	public void f() {
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start from Listeners");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success from Listeners");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Fail from Listeners");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skip from Listeners");
	}
}

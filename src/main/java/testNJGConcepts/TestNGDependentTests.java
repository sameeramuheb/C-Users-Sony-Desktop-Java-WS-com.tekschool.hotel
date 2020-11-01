package testNJGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependentTests {
	
	@Test(groups = {"smoke"})
	public void test_OpenBrowser() {
		
		Assert.assertTrue(true);
		
		System.out.println("this is openbrowser test");
		
	}
	
	@Test (dependsOnMethods = {"test_OpenBrowser"})
	public void test_NavigatesToURL() {
		System.out.println("This method will be executed if dependent browser is passed");
		
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test_NavigateToURL"}, dependsOnGroups = {"smoke"})
	public void test_SignINtoApplication() {
		System.out.println("This methoed will be executed if the two other test or methods are executed");
	}

}

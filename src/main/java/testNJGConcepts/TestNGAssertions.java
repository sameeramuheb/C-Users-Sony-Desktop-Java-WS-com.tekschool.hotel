package testNJGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {
	
	//Assertions are used to validate expected results against actual result
	//TestNG provides two types of Assertions
	//Hard Assertion: if expected is not equal to actual the execution will stop at this point
	//Soft Assertion: if expected is not equal to actual, execution will continue but test case will fail
// syntax for hard Assertion is : Assert.MethodName(Actual,Expected)
	
// SoftAssertion class is provided by TestNG, we need to creat obj of SoftAssertion class
	//then we can use methods provided by softAssertion class, at the end of assertion we need to 
	//call assertAll method to confirm assertion, otherwise it will not provide test status.
@Test(enabled = false)

//enabled = false will ignore the test case from execution
public void hardAssertion() {
	
	
	int actualValue =4;
	int expectedValue=5;
	
	Assert.assertEquals(actualValue, expectedValue);
	
	System.out.println("this is line of code will be executed as assertion passed");
	
}
@Test
public void softAssertion() {
	
	int a = 10;
	int b =15;
	
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(a,b);
	System.out.println("this line of code will be executed regardless of assertion pass or fail");
	softAssert.assertTrue(false);
	System.out.println("This is after second execution");
	
	softAssert.assertAll();
	
}
}
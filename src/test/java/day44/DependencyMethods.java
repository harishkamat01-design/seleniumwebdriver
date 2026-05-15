package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

/* 
 If we does not write the dependency in the @Test level, even if the openapp() fails, 
 other 4 methods will execute and pass which is waste of time,
 so we need to write the dependency in @Test level.
 
 */
public class DependencyMethods 
{
	@Test (priority=1)
	void openapp()
	{
		Assert.assertTrue(false);  // will fail
	}
	
	@Test (priority=2, dependsOnMethods = {"openapp"})
	void login()
	{
		Assert.assertTrue(true); // should pass but as we add dependency, it will be skipped
	}
	
	@Test (priority=3, dependsOnMethods = {"login"})
	void search()
	{
		Assert.assertTrue(true);   // should pass but as we add dependency, it will be skipped
	}
	
	@Test (priority=4, dependsOnMethods = {"login","search"})
	void advancedsearch()
	{
		Assert.assertTrue(true);   // should pass but as we add dependency, it will be skipped
	}
	
	@Test (priority=5,dependsOnMethods = {"login"})
	void logout()
	{
		Assert.assertTrue(true);   // should pass but as we add dependency, it will be skipped
	}
	
	
	
	
	
}

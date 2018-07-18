package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import gurupages.DemoGuru;


public class PolicyTabTest extends SampleTest {
	
	@BeforeMethod
	public void setUp() throws Exception {
       super.setUp();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		super.tearDown();
	}
	@Parameters({"uid","pass"})
	@Test
	public void navToPolicy(String user, String pass) throws Exception {
		super.loginPC(user, pass);
		super.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		super.polCenter.navigateToPolicyTab();
	}
}

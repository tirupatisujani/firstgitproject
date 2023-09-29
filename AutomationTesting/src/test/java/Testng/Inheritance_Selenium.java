package Testng;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Inheritance_Selenium extends Base_Class{

		@BeforeSuite
		public void launchBrowser() {

			browserLaunching("edge");

			System.out.println("i am in @BeforeSuite method ");
		}

		@BeforeTest
		public void maximizeBriwser() {

			browserMaximization();

			System.out.println("i am in @BeforeTest method ");

		}

		@BeforeClass
		public void launchURL() {

			urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			System.out.println("i am in @Beforeclass method ");

		}

		@BeforeMethod
		public void wait1() {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

			System.out.println("i am in @Beforemethod method ");

		}

		@Test(priority = 1)
		public void enterUsername() {
			
			enterTextToTheTextbox("//input[@name='username']","Admin");
					
			System.out.println("i am in enterUsername method ");

		}

		@Test(priority = 2)
		public void enterPassword() {
			
			enterTextToTheTextbox("//input[@name='password']","admin123");
			
			System.out.println("i am in enterPassword method ");

		}

		@Test(priority = 3)
		public void clickLogin() {

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			System.out.println("i am in clicklogin method ");

		}

		@AfterMethod
		public void wait2() {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

			System.out.println("i am in @Aftermethod method ");

		}

		@AfterSuite
		public void closeBrowser() {

			browserClose();

			System.out.println("i am in @afterSuite method ");

		}

	}


package Testng;
	import java.io.IOException;
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
	import Testng.Base_Class;

	public class Screenshot_Example extends Base_Class{

		@BeforeSuite
		public void launchBrowser() throws IOException {

			browserLaunching("chrome");
			
			takescreenshot("browserlaunched.png");

			System.out.println("i am in @BeforeSuite method ");
		}

		@BeforeTest
		public void maximizeBriwser() throws IOException {

			browserMaximization();
			
			takescreenshot("Browser maximization.png");

			System.out.println("i am in @BeforeTest method ");

		}

		@BeforeClass
		public void launchURL() throws IOException {

			urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			takescreenshot("URL launched.png");

			System.out.println("i am in @Beforeclass method ");

		}

		@BeforeMethod
		public void wait1() {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

			System.out.println("i am in @Beforemethod method ");

		}

		@Test(priority = 1)
		public void enterUsername() throws IOException {
			
			enterTextToTheTextbox("//input[@name='username']","Admin");
			
			takescreenshot("Username.png");
					
			System.out.println("i am in enterUsername method ");

		}

		@Test(priority = 2)
		public void enterPassword() throws IOException {
			
			enterTextToTheTextbox("//input[@name='password']","admin123");
			
			takescreenshot("password.png");
			
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
		public void closeBrowser() throws IOException {
			
			takescreenshot("before browser closed.png");

			browserClose();

			System.out.println("i am in @afterSuite method ");

		}

	}

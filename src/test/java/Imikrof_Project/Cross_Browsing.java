package Imikrof_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browsing {

	
		WebDriver driver;

		/**
		 * This function will execute before each Test tag in testng.xml
		 * @param browser
		 * @throws Exception
		 */
		@Test (priority=1)
		@Parameters("browser")
		public void setup(String browser) throws Exception{
			
			//Check if parameter passed from TestNG is 'firefox'

			
			//Check if parameter passed as 'chrome'
			 if(browser.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.ex");
				//create chrome instance
				driver = new ChromeDriver();
			}
			//Check if parameter passed as 'Edge'
					else if(browser.equalsIgnoreCase("Edge")){
						//set path to Edge.exe
						System.setProperty("webdriver.edge.driver","./driver/MsedgetWebDriver.exe");
						//create Edge instance
						driver = new EdgeDriver();
					}
			else{
				//If no browser passed throw exception
				throw new Exception("Browser is not correct");
			}
		}
		
		@Test(priority=2)
		public void testParameterWithXML() throws InterruptedException{
			
			driver.get("http://demo.guru99.com/V4/");
			//Find user name
			WebElement userName = driver.findElement(By.name("uid"));
			//Fill user name
			userName.sendKeys("guru99");
			//Find password
			WebElement password = driver.findElement(By.name("password"));
			//Fill password
			password.sendKeys("guru99");
	}

}

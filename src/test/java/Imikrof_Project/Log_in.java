package Imikrof_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_in {

	public static void main(String[] args) throws InterruptedException {
		//Add chrome Driver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Given Software Link
		driver.get("https://timf.imikrof.com/");
		//Add Browser on Maximize Size
		driver.manage().window().maximize();
		
		//Add Email Id Of Log In Panel
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("it0062");
		// Add Pass for Log iN
		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("##imikrof@2021");
		
		WebElement login= driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
		login.click();
		
		/*driver.get("https://timf.imikrof.com/s/samity/create");
		
			WebElement s_name = driver.findElement(By.xpath("//*[@id=\"container\"]/section/div/form/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[2]/input"));
			s_name.clear();
			s_name.sendKeys("0062-096");
		
			Select product = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/section/div/form/div/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[2]/select")));
		    product.selectByVisibleText("Micro Credit - MC");*/
		    
		    Thread.sleep(2000);


	}

}

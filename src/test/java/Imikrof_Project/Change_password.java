package Imikrof_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Change_password {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://timf.imikrof.com/");
		driver.manage().window().maximize();
		
		//LogIN
		WebElement user = driver.findElement(By.id("email"));
		user.clear();
		user.sendKeys("");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("");
		
		WebElement login= driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
		login.click();
		
		//driver.navigate().to("https://timf.imikrof.com/s/change_password");
		driver.get("https://timf.imikrof.com/s/change_password");
		
		
		//Change Password
		
		WebElement old_pass = driver.findElement(By.id("old_password"));
		old_pass.clear();
		old_pass.sendKeys("");
		
		WebElement new_pass = driver.findElement(By.id("new_password"));
		new_pass.clear();
		new_pass.sendKeys("");
		
		WebElement con_pass = driver.findElement(By.id("confirm_pass"));
		con_pass.clear();
		con_pass.sendKeys("");
		
		WebElement update = driver.findElement(By.xpath("//*[@id=\"submit_button\"]"));
		update.click();
		
		
		Thread.sleep(2000);
	    driver.close();
		driver.quit();

	}

}

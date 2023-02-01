package Imikrof_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Report_show {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://timf.imikrof.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("");
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("");
		
		WebElement login = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
		login.click();
		
		  driver.get("https://timf.imikrof.com/REPORT_PKSF_POMIS_3");
		
		  //Report Level	:
	      Select report_level = new Select(driver.findElement(By.name("report_level")));
	      report_level.selectByVisibleText("");
	      Thread.sleep(2000);
	      
	      //Branch 	:
	      Select branch = new Select(driver.findElement(By.name("cbo_branch")));
	      branch.selectByVisibleText("8 - Bogura Town Area");
	      Thread.sleep(2000);
	      
	      //Month
	      Select month = new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/table/tbody/tr/td[3]/select")));
	      month.selectByVisibleText("May");
	      
	      //Year
	      Select year = new Select(driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/table/tbody/tr/td[4]/select")));
	      year.selectByVisibleText("2022");
	      
	      //Show
	      WebElement show = driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/table/tbody/tr/td[9]/button"));
	      show.click();
		
		  Thread.sleep(2000);

	}

}

package Demo_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailSignin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("nithijp24@gmail.com");
		WebElement next = driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span"));
		next.click();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("London@2020");
		WebElement loginimage = driver.findElement(By.xpath("//*[@id=\'gb\']/div[2]/div[3]/div[1]/div[2]/div/a/img"));
		loginimage.click();
		WebElement signout = driver.findElement(By.id("gb_71"));
		signout.click();
	}

}

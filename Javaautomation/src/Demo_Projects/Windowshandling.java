package Demo_Projects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\browserdrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String oldwindow = driver.getWindowHandle();
		WebElement openwindow = driver.findElement(By.id("windowButton"));
		openwindow.click();
		Set<String> allwindow = driver.getWindowHandles();
		for (String newwindow : allwindow) {

			driver.switchTo().window(newwindow);
		}

		driver.close();
		driver.switchTo().window(oldwindow);   
		WebElement messagetext = driver.findElement(By.id("messageWindowButton"));
		messagetext.click();
		int noofwindows=driver.getWindowHandles().size();
		System.out.println(noofwindows);
		WebElement openwindow1 = driver.findElement(By.id("windowButton"));
		openwindow1.click();
		Set<String> allwindow1 = driver.getWindowHandles();
		for (String newwindow1 : allwindow1) {
			if(!newwindow1.equals(oldwindow));
			driver.switchTo().window(newwindow1);
			driver.close();
		}
	}
}
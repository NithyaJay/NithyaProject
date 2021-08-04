package Demo_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		WebElement nextxtab = driver.findElement(By.id("draggableExample-tab-axisRestriction"));
		nextxtab.click();
		WebElement From = driver.findElement(By.id("restrictedX"));
		WebElement To = driver.findElement(By.id("restrictedY"));
		Actions action = new Actions(driver);
		action.dragAndDrop(From, To).build().perform();

	}

}

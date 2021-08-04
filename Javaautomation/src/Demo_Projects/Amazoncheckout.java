package Demo_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoncheckout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.co.uk");
		WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signin.click();
		WebElement mobileno=driver.findElement(By.id("ap_email"));
		mobileno.sendKeys("9788167033");
		WebElement next =driver.findElement(By.id("continue"));
		next.click();
		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys("london2020");
		WebElement login =driver.findElement(By.id("signInSubmit"));
		login.click();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("toys");
		WebElement submit = driver.findElement(By.id("nav-search-submit-button"));
		submit.click();
		WebElement sortby = driver.findElement(By.id("a-autoid-0-announce"));
		sortby.click();
		WebElement newest = driver.findElement(By.id("s-result-sort-select_4"));
		newest.click();
		driver.get("https://www.amazon.co.uk/gp/product/B097DD16VV/ref=ewc_pr_img_2?smid=A2KM5BMNQH5LXE&psc=1");	
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		WebElement editcart = driver.findElement(By.id("hlb-view-cart-announce"));
		editcart.click();
		WebElement qtyincrease = driver.findElement(By.id("a-autoid-1-announce"));
		qtyincrease.click();
		WebElement qty2 = driver.findElement(By.id("dropdown1_2"));
		qty2.click();
		WebElement proceedcheckout = driver.findElement(By.name("proceedToRetailCheckout"));
		proceedcheckout.click();	
	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;   
import org.openqa.selenium.support.ui.Select;

public class JPetStore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm="); 
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("26");
		driver.findElement(By.name("password")).sendKeys("Naveen");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Naveen");
		driver.findElement(By.name("account.firstName")).sendKeys("Naveen");
		driver.findElement(By.name("account.lastName")).sendKeys("R");
		driver.findElement(By.name("account.email")).sendKeys("naveenprasad222@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("1234567890");
		driver.findElement(By.name("account.address1")).sendKeys("junction road");
		driver.findElement(By.name("account.address2")).sendKeys("vriddhachalam");
		driver.findElement(By.name("account.city")).sendKeys("cuddalore");
		driver.findElement(By.name("account.state")).sendKeys("Tamilnadu");
		driver.findElement(By.name("account.zip")).sendKeys("606001");
		driver.findElement(By.name("account.country")).sendKeys("India");
		
		Thread.sleep(1000);
		WebElement language = driver.findElement(By.name("account.languagePreference"));
		Select drop = new Select(language);
		drop.selectByContainsVisibleText("japanese");
		Thread.sleep(1000);
		WebElement animals = driver.findElement(By.name("account.favouriteCategoryId"));
		Select drop2 = new Select(animals);
		drop2.selectByContainsVisibleText("CATS");
		 
		Thread.sleep(1000);
		WebElement check2 = driver.findElement(By.name("account.listOption"));
		check2.click();
		Thread.sleep(1000);
		WebElement check = driver.findElement(By.name("account.bannerOption"));
		check.click();
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}

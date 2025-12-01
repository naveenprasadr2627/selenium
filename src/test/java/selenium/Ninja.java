package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ninja {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Naveen");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.name("email")).sendKeys("naveen@2627gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9344822004");
		driver.findElement(By.name("password")).sendKeys("Naveen");
		driver.findElement(By.name("confirm")).sendKeys("Naveen");
		WebElement check = driver.findElement(By.name("agree"));
		check.click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		Thread.sleep(3000);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		driver.findElement(By.name("password")).sendKeys("Naveen");
		
		Thread.sleep(3000);
//		driver.close();
		

	}
 
}

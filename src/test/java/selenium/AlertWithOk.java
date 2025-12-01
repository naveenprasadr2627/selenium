package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		 Alert alt = driver.switchTo().alert();
		 Thread.sleep(2000);
		 alt.accept();
		 driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		 driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		 Thread.sleep(2000);
		 alt.dismiss();
		 String url =driver.getCurrentUrl();
		 System.out.println(url);
		 String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		 System.out.println(text);
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 System.out.println(driver.getCurrentUrl());
		 
		
//		driver.close();

	}

}

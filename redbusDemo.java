package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class redbusDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-no='1']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//li[@data-no='3']")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[contains(@class,'wd')][1]")).click();
		Thread.sleep(3000);
	WebElement Search=driver.findElement(By.xpath("//button[contains(@class,'button')]"));
		Search.click();
		Thread.sleep(3000);
	String busesResultFound = driver.findElement(By.xpath("//span[contains(@class,'w-60 d-block')]")).getText();
		System.out.println(busesResultFound);
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
	String BussecndResult=driver.findElement(By.xpath("(//div[contains(@class,'travels lh-24 f-bold')])[2]")).getText();
		System.out.println("The SecondREsult is: "+ BussecndResult);
	String title=driver.getTitle();
		System.out.println(title);
		
	
	}

}

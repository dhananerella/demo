package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("dhanalakshmi");
		driver.findElement(By.xpath("//*[@id='frmLogin']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
       webelement logo= driver.findElement(By.xpath("//*[@id='divLogo']"/img)); 
    		   
    		   if(logo.isdisplayed())
    		   {System.out.println("test is passed");
    		   
    		   }
    		   else {
    			   System.out.println("test is failed");
    		   }
       driver.close();
}
}

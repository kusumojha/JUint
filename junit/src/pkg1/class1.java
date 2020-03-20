package pkg1;
// FACEBOOK LOGIN PAGE USING SCANNER CLASS
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\chromedriver.exe");
		System.out.println("enter user name");
		Scanner s=new Scanner(System.in);
	    String u=s.next();
	    System.out.println("enter password");
	    String p=s.next();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys(u);
		WebElement pwd=driver.findElement(By.id("pass"));
	    pwd.sendKeys(p);
	    WebElement login=driver.findElement(By.id("u_0_b"));
	    login.click();
		
	}

}

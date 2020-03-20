package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignupwithxpath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\java\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement first_name=driver.findElement(By.xpath("//input[@name='firstname']"));
		first_name.sendKeys("kusum");
		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("ojha");
		WebElement mobile_no=driver.findElement(By.xpath("//input[@name='reg_email__' or @id='u_0_z']"));
		mobile_no.sendKeys("3333332255");
		WebElement new_pwd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		new_pwd.sendKeys("12345");
	    WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day' and @id='day']"));
		Select s=new Select(date);
		s.selectByVisibleText("13");
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month' and @id='month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Oct");
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year' and @id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1995");
		WebElement gender=driver.findElement(By.xpath("//input[@name='sex' or @id='u_0_6']"));
		gender.click();
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
	}

}

package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookSignupByJunit 
{
	ChromeDriver driver;

	@Before
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\java\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void signup()
	{
		WebElement first_name=driver.findElement(By.name("firstname"));
		first_name.sendKeys("kusum");
		WebElement surname=driver.findElement(By.name("lastname"));
		surname.sendKeys("ojha");
		WebElement mobile_no=driver.findElement(By.id("u_0_r"));
		mobile_no.sendKeys("3333332255");
		WebElement new_pwd=driver.findElement(By.name("reg_passwd__"));
		new_pwd.sendKeys("12345");
		WebElement date=driver.findElement(By.cssSelector("select[title='Day']"));
		Select s=new Select(date);
		s.selectByVisibleText("13");
		WebElement month=driver.findElement(By.cssSelector("select[title='Month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Oct");
		WebElement year=driver.findElement(By.cssSelector("select[title='Year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1995");
		WebElement gender=driver.findElement(By.id("u_0_6"));
		gender.click();
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
	}
	@After
	public void after()
	{
		driver.close();
	}
	
}

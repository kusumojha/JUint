package pkg1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooksignup1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\java\\chromedriver.exe");
		System.out.println("enter first name");
		Scanner s=new Scanner(System.in);
		String f_name=s.next();
		System.out.println("enter last name");
		String l_name=s.next();
		System.out.println("enter mobile number ");
		String mno=s.next();
		System.out.println("enter password name");
		String pwd=s.next();
	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement first_name=driver.findElement(By.name("firstname"));
		first_name.sendKeys(f_name);
		WebElement last_name=driver.findElement(By.name("lastname"));
		last_name.sendKeys(l_name);
		WebElement mobile_no=driver.findElement(By.id("u_0_r"));
		mobile_no.sendKeys(mno);
		WebElement new_pwd=driver.findElement(By.name("reg_passwd__"));
		new_pwd.sendKeys(pwd);
		WebElement date=driver.findElement(By.cssSelector("select[title='Day']"));
		Select s3=new Select(date);
		s3.selectByVisibleText("13");
		WebElement month=driver.findElement(By.cssSelector("select[title='Month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Oct");
		WebElement year=driver.findElement(By.cssSelector("select[title='Year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1995");
		WebElement gender=driver.findElement(By.cssSelector("label[for='u_0_6']"));
		gender.click();
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
		
		
		
	}

}

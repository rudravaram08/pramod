package Masters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class lib_class {
	
	WebDriver driver;
	ChromeOptions options;

	public String openapp(String url) throws InterruptedException
	{
		options = new ChromeOptions();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		System.out.println("app_opened");
		return url;
	}
	public String login(String userid, String pw) throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println("login done");
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		Thread.sleep(3000);
		return pw;
	}
	
	public String rolec(String roletyp, String empnme, String usrnme,String stus, String apw, String acpw) throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		Select s = new Select (driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
		s.selectByVisibleText(roletyp);
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys(empnme);
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys(usrnme);
		Select s1 = new Select (driver.findElement(By.xpath("//select[@id='systemUser_status']")));
		s1.selectByVisibleText(stus);
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys(apw);
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys(acpw);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		System.out.println("role_created");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return apw;
	}

}

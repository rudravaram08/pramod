package Basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basic_c {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		Select s = new Select (driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
		s.selectByVisibleText("ESS");
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Steven Edwards");
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("bbbbbbbb");
		Select s1 = new Select (driver.findElement(By.xpath("//select[@id='systemUser_status']")));
		s1.selectByVisibleText("Enabled");
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();

	}

}

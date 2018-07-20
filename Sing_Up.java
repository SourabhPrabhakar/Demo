package Facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sing_Up {
	public static void main(String[] args) throws IOException, InterruptedException{ 
		
				///	System.setProperty("webdriver.chrome.driver","E:\\IEDriverServer\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				System.out.println("Browser Launched");
				driver.manage().window().maximize();
				String Link="https:\\www.facebook.com";
				driver.get(Link);
				Thread.sleep(5000);
/*
						   
			    WebElement Notification=driver.findElement(By.xpath("//*[@id='js_2l']"));
    			Notification.click();
				WebElement New_nty=Notification.findElement(By.xpath("//*[@id='fbNotificationsFlyout']"));
				New_nty.click();
							
							
			   WebElement Accountsetting= driver.findElement(By.xpath("//*[@id='userNavigationLabel']"));
			   Accountsetting.click();
		         WebElement logOut_btn=Accountsetting.findElement(By.xpath("//*[@id='js_1o']/div/div/ul/li[12]/a/span/span"));
		         logOut_btn.click();
				 Thread.sleep(2500);
	
				driver.close();
		*/		
				
			   WebElement First_name=driver.findElement(By.name("firstname"));
			   WebElement Last_name=driver.findElement(By.name("lastname"));
			   WebElement email_mobile=driver.findElement(By.name("reg_email__"));
			   WebElement Password=driver.findElement(By.name("reg_passwd__"));
			   First_name.sendKeys("Sourabh");
			   Last_name.sendKeys("Sharma");
			   email_mobile.sendKeys("91580458363");
			   Password.sendKeys("News@1234");
			   Select Day=new Select(driver.findElement(By.id("day")));
			   Day.selectByValue("14");
			   Day.getOptions();
			   Select Month=new Select(driver.findElement(By.id("month")));
			   Month.selectByValue("7");
			   Select Year=new Select(driver.findElement(By.id("year")));
			   Year.selectByValue("1992");
			   WebElement Gender=driver.findElement(By.id("u_0_a"));
			   Gender.click();
			   WebElement SignUp_btn=driver.findElement(By.name("websubmit"));
			   SignUp_btn.click();
			   //driver.quit();
			   
			   
	}
}

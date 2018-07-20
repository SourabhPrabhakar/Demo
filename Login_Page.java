package Facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_Page {
public static void main(String[] args) throws IOException, InterruptedException{ 
	
/*
		File src=new File(".application.properties");

		// Create  FileInputStream object
		FileInputStream fis=new FileInputStream(src);

		// Create Properties class object to read properties file
		Properties pro=new Properties();

		// Load file so we can use into our script
		pro.load(fis); 
		
*/
	ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	///	System.setProperty("webdriver.chrome.driver","E:\\IEDriverServer\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		System.out.println("ie open");
		driver.manage().window().maximize();
		String Link="https:\\www.facebook.com";
		driver.get(Link);
		
		WebElement UserName=driver.findElement(By.id("email"));
		 UserName.sendKeys("919996395301");
		 System.out.println("value entered");
		WebElement Password=driver.findElement(By.id("pass"));
			 Password.sendKeys("Sharma@12");
			 Password.submit();
			 Thread.sleep(4000);
		
			 /*Alert alert= driver.switchTo().alert();
			 alert.dismiss();
			 
			 Actions builder = new Actions(driver);
			 builder.sendKeys(Keys.ENTER).build().perform();//*[@id="userNavigationLabel"]
			 builder.release().perform();  */
			
			 
			 
				Thread.sleep(5000);

				   
				   WebElement Notification=driver.findElement(By.xpath("//*[@id='js_2l']"));
				   Notification.click();
				   WebElement New_nty=Notification.findElement(By.xpath("//*[@id='fbNotificationsFlyout']"));
					New_nty.click();
					///////
					
	   WebElement Accountsetting= driver.findElement(By.xpath("//*[@id='userNavigationLabel']"));
	   Accountsetting.click();
	/*	 search.submit();
		 System.out.println("clicked");
	 WebElement list=driver.findElement(By.xpath("//*[@id='rso']/div/div/div[1]/div/div/h3/a"));
		 
		 list.click();
		 Alert alert=driver.switchTo().alert();
		 alert.dismiss();
		 
		
*/
//WebElement Name=driver.findElement(By.name("firstname"));
	   Thread.sleep(2500);
		/* driver.switchTo().frame(0);
		 System.out.println("Switched to frame0");
*/
         WebElement logOut_btn=Accountsetting.findElement(By.xpath("//*[@id='js_1o']/div/div/ul/li[12]/a/span/span"));
         logOut_btn.click();
		 Thread.sleep(2500);
	//	 WebElement PopUp=driver.findElement(By.xpath("//*[@id='welcome']/div/div/div[4]/input"));

	//	PopUp.click();		
		driver.close();
		
	}

}

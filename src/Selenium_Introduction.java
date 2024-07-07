import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This object can call all methods of chromedriver(personal and webdriver implemented methods)
	    //ChromeDriver driver=new ChromeDriver();
	
		
		//To invoke webdriver need to specify path where driver is located
		//System.setProperty("webdriver.chrome.driver", "D:/Shravya Koora/Automation_Testing/Drivers/Chrome_Driver/chromedriver_win32/chromedriver.exe");
		
		// This object can call only webdriver implemented methods.
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		
		System.out.println("Develop Branch");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	

	}

}

package BrowserLaunch;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.ie.InternetExplorerDriver;

public class firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Ravi Varman\\Desktop\\New folder\\desktop\\Program\\selenium\\Day1\\drivers\\IEDriverServer.exe");

	WebDriver driver=new InternetExplorerDriver(); 
	
	driver.get("http://www.google.com/"); 
	System.out.println(driver.getTitle());
	driver.quit();
	
	}	
}



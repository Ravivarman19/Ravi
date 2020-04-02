import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Ravi Varman\\Desktop\\New folder\\desktop\\Program\\selenium\\Day1\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
		
driver.get("http://www.google.com/"); 
System.out.println(driver.getTitle());
driver.quit();
		
		}	
	}


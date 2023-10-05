import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightWidth {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement d1 = driver.findElement(By.id("username"));
		WebElement d2 = driver.findElement(By.name("pwd"));
		//int height=username.getsize().getheight();
		//int width=username.getsize().getwidth();
		//int height1=pwd.getsize().getheight();
		//int width1=pwd.getsize().getwidth();
		System.out.println("height");
		System.out.println("width");
		System.out.println("height1");
		System.out.println("width1");
		driver.quit();

		
		
		
		

	}

}

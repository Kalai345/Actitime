import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int x1=driver.findElement(By.xpath("Female")).getLocation().getY();
		int x2=driver.findElement(By.xpath("Male")).getLocation().getY();
		int x3=driver.findElement(By.xpath("Custom")).getLocation().getY();
		((WebElement) driver).click();
		Thread.sleep(2000);
		if(x1==x2&&x2==x3) {
			System.out.println("ration button properly alligned");
			
			
		}else {
			System.out.println("ratio button not properly alligned");
		}
		//((WebElement) driver).click();
		//Thread.sleep(2000);
		driver.quit();
		
		

	}

}

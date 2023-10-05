import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionCap {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/hotel.html");
		WebElement m = driver.findElement(By.id("mtr"));
		Select s=new Select(m);
		List<WebElement> alloptions = s.getOptions();
		for(int i=0;i<alloptions.size();i++) {
			Thread.sleep(1000);
			s.selectByIndex(i);
			
			//String text = alloptions.get(i).getText();
			//System.out.println(text);
		}
		driver.quit();
		
	}
}

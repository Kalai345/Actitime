import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsGetAtt {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String value=link.getAttribute("href");
		String tag=link.getTagName();
		System.out.println(value);
		System.out.println(tag);
		driver.quit();
		

	}

}

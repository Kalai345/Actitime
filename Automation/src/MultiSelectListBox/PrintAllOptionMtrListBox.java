package MultiSelectListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionMtrListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/hotel.html");
		WebElement mtrListBox=driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement>alloptions=s.getOptions();
		for(int i=0;i<alloptions.size();i++) {
		String text=alloptions.get(i).getText();
		System.out.println(text);
		
		}
		driver.quit();
	}

}
	

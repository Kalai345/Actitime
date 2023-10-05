package Mock;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicateMtr {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/hotel.html");
		WebElement m = driver.findElement(By.id("mtr"));
		Select s=new Select(m);
		 Set<String> set = new TreeSet();
		List<WebElement> alloptions = s.getOptions();
		 for(int i=0;i<alloptions.size();i++) {
			 String text = alloptions.get(i).getText();
			 set.add(text);
		 }
		for(String string:set){
			System.out.println(string);
			
			
		}
		driver.quit();
		
		

	}

}

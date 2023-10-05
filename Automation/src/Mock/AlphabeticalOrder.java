package Mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/hotel.html");
	WebElement m = driver.findElement(By.id("mtr"));
	Select s=new Select(m);
	List<WebElement> alloptions = s.getOptions();
	ArrayList al = new ArrayList();
	for(int i=0;i<alloptions.size();i++) {
		String text = alloptions.get(i).getText();
		al.add(text);
		Collections.sort(al);
	}
	for(int i=0;i<al.size();i++) {
	Object option =  al.get(i);
	System.out.println(option);
		
	}
	driver.quit();
	
	

	}

}

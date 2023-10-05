import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.twitter.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}

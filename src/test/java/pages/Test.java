package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("E:\\testing\\selenium\\automationchallege.com\\index.html");
		driver.manage().window().maximize();
		try
		{
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.id("div1"));
		WebElement e2=driver.findElement(By.id("drag1"));
		Actions a=new Actions(driver);
		a.dragAndDrop(e1,e2).build().perform();
		Thread.sleep(5000);
		driver.quit();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			driver.quit();
		}
		

	}

}

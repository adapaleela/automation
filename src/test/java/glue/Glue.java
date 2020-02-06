package glue;


import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AutomationChallengePage;

public class Glue 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public Scenario s;
	public Properties p;
	public AutomationChallengePage acp;
	
	
	@Given("^Navigate to the home page$")
	public void navigate_to_the_home_page()  
	{
		driver=new ChromeDriver();
		acp=new AutomationChallengePage(driver);
		wait=new WebDriverWait(driver,30);
	    driver.get("E:\\testing\\selenium\\automationchallege.com\\index.html");
	    driver.manage().window().maximize();
	}

	@When("^In Test1 div click the Open Modal Button$")
	public void in_Test_div_click_the_Open_Modal_Button() 
	{
		wait.until(ExpectedConditions.visibilityOf(acp.open_modal));
		acp.clickOnOpenModal();
	}

	@When("^Enter values for Name and City$")
	public void enter_values_for_Name_and_City(DataTable dt) throws Exception
	{
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(acp.name));
		
		List<List<String>> data=dt.asLists(String.class);
		String name=data.get(0).get(0);
		String city=data.get(0).get(1);
		
		
		acp.fillName(name);
		wait.until(ExpectedConditions.visibilityOf(acp.city));
		acp.fillCity(city);
	}

	@When("^Click the Enter Data Button$")
	public void click_the_Enter_Data_Button() 
	{
		wait.until(ExpectedConditions.visibilityOf(acp.enter_data));
		acp.clickEnterData();
	}

	@When("^Close the Modal$")
	public void close_the_Modal() 
	{
		wait.until(ExpectedConditions.visibilityOf(acp.close));
		acp.clickClose();
	}

	@Then("^Verify values under Open Modal button that were entered in the textboxes$")
	public void verify_values_under_Open_Modal_button_that_were_entered_in_the_textboxes() throws Exception 
	{
		Thread.sleep(5000);
		String name=driver.findElement(By.id("nameVal")).getText();
		Thread.sleep(5000);
		String city=driver.findElement(By.id("cityVal")).getText();
		System.out.println(name+" "+city);
		if(name.equalsIgnoreCase("leela") && city.equalsIgnoreCase("vijayawada"))
		{
			Thread.sleep(3000);
			//s.write("entered values are present");
			System.out.println("entered values are present");
		}
		else
		{
			byte[] b=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			s.embed(b,"entered values are not present");
		}
			
		
	}

	@When("^In Test2 div click on Click Me$")
	public void in_Test_div_click_on_Click_Me()
	{
	    wait.until(ExpectedConditions.visibilityOf(acp.click_me));
	    acp.clickOnClickMe();
	}

	@Then("^Verify and print all the available options$")
	public void verify_and_print_all_the_available_options() throws Exception
	{
		Thread.sleep(5000);
	    List<WebElement> l=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']"));
	    for(int i=0;i<l.size();i++)
	    {
	    	System.out.println(l.get(i).getText());
	    }
	}

	@When("^Search for the keyword \"(.*)\"$")
	public void search_for_the_keyword(String x) 
	{
		wait.until(ExpectedConditions.visibilityOf(acp.searchTest2));
		acp.fillSearchMeInTest2(x);
	}

	@Then("^Verify two options are visible as Angular and Angular2$")
	public void verify_two_options_are_visible_as_Angular_and_Angular()
	{
		 List<WebElement> l=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']"));
		    for(int i=0;i<l.size();i++)
		    {
		    	System.out.println(l.get(i).getText());	
		    }
		    if(l.size()==2)
		    {
		    	//s.write("angular and angular2 are present");
		    	System.out.println("angular and angular2 are present");
		    }
		    else
		    {
		    	byte[] b=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				//s.embed(b,"options are not available based on searched option");
		    	System.out.println("angular and angular2 are not present");
		    }
		    
	}

	@When("^Clear the search box and type \"(.*)\"$")
	public void clear_the_search_box_and_type(String x)
	{
	    acp.searchTest2.clear();
	    acp.fillSearchMeInTest2(x);
	}

	@Then("^Verify no option is visible$")
	public void verify_no_option_is_visible() 
	{
		 List<WebElement> l=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']"));
		 if(l.size()==0)
		 {
			 //s.write("no vlaues are present based on searched value");
			 System.out.println("no vlaues are present based on searched value");
		 }
		 else
		 {
			 // byte[] b=driver.getScreenshotAs(OutputType.BYTES);
			 //s.embed(b,"options are  available based on searched option");
			 System.out.println("no vlaues are not present based on searched value");
		 }
	}

	@When("^In Test3 div search box enter value \"(.*)\"$")
	public void in_Test_div_search_box_enter_value(String x) 
	{
		acp.fillSearchTest3(x);
	}

	@Then("^Verify table displays two rows with country as USA$")
	public void verify_table_displays_two_rows_with_country_as_USA() throws Exception
	{
	    Thread.sleep(5000);
	    int i=0;
	    int j=0;
	    //String xpath="//table/tbody/tr[1]/td[3]";
	    List<WebElement> l=driver.findElements(By.xpath("//table/tbody/tr"));
	    for(i=1;i<l.size();i++)
	    {
	    	Thread.sleep(3000);
	    	String x=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
	    	System.out.println(x);
	    	if(x.equalsIgnoreCase("usa"))
	    	{
	    		System.out.println("usa passed");
	    		j++;
	    	}
	    }
	    System.out.println(j);
	    if(j==2)
    	{
    		//s.write("passed");
    		System.out.println("Verified table displays two rows with country as USA");
    	}
    	else
    	{
    		//s.write("failed");
    		System.out.println("Failed ,table does not displays two rows with country as USA");
    	}
	}

	@When("^Clear search box$")
	public void clear_search_box() throws Exception 
	{
		Thread.sleep(3000);
	    acp.search_me_Test3.clear();
	    acp.search_me_Test3.sendKeys(Keys.ENTER);
	    Thread.sleep(6000);
	}

	@Then("^Verify table displays four rows$")
	public void verify_table_displays_four_rows() throws Exception  
	{
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//table/tbody/tr"));
		if(l.size()==4)
		{
			//s.write("passed");
			System.out.println("Verified table displays four rows");
		}
		else
		{
			//s.write("failed");
			System.out.println("failed, table does not displays four rows");
		}
	}

	@When("^In Test4 div drag button Drag Me to the Red Rectangle box$")
	public void in_Test_div_drag_button_Drag_Me_to_the_Red_Rectangle_box() throws Exception
	{
		Thread.sleep(5000);
		
		WebElement e=driver.findElement(By.xpath("(//div[@class='jumbotron'])[4]/div/div"));
		Thread.sleep(5000);
		
		WebElement e1=driver.findElement(By.xpath("(//div[@class='jumbotron'])[4]/descendant::button"));
		//System.out.println(e1.getAttribute("draggable"));
		//e1.click();
		Thread.sleep(5000);
		
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		a.dragAndDrop(e, e1).build().perform();
		int x= e.getSize().getWidth();
		int y=e.getSize().getHeight();
		Thread.sleep(10000);
	}

	@Then("^After dragging, verify if button was dragged inside the box$")
	public void after_dragging_verify_if_button_was_dragged_inside_the_box()
	{
		
	    
	}

	
	@When("^close site$")
	public void close_site() throws Exception
	{
		driver.quit();
	}


}

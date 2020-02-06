package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationChallengePage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//button[text()='Open Modal']")
	public WebElement open_modal;
	
	@FindBy(id="name")
	public WebElement name;
	
	@FindBy(id="city")
	public WebElement city;
	
	@FindBy(xpath="//button[text()='Enter Data ']")
	public WebElement enter_data;
	
	@FindBy(xpath="//button[text()='Close']")
	public WebElement close;
	
	
	@FindBy(xpath="//button[contains(text(),'Click Me!')]")
	public WebElement click_me;
	
	@FindBy(xpath="//input[@placeholder='Search..' and @id='myInput']")
	public WebElement searchTest2;
	
	@FindBy(id="searchMe")
	public WebElement search_me_Test3;
	
	
	public AutomationChallengePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnOpenModal()
	{
		open_modal.click();
	}
	
	public void fillName(String x)
	{
		name.click();
		name.sendKeys(x,Keys.TAB);
	}
	
	public void fillCity(String x)
	{
		city.click();
		city.sendKeys(x);
	}
	
	public void clickEnterData()
	{
		enter_data.click();
	}
	
	public void clickClose()
	{
		close.click();
	}
	
	public void clickOnClickMe()
	{
		click_me.click();
	}
	
	public void fillSearchMeInTest2(String x)
	{
		searchTest2.sendKeys(x,Keys.ENTER);
	}
	
		
	public void fillSearchTest3(String x)
	{
		search_me_Test3.sendKeys(x,Keys.ENTER);
	}
}

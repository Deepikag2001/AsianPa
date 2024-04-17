package HomePageFactory;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactory1 {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	Select select;
	Actions act;

	public PageFactory1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//-------------------------------------/*PATHS FOR LOCATING THE ELEMENTS*/--------------------------------------------------------------//

	/* SCENARIO 1 */

	/* x-path to find store */
	@FindBy(xpath = "//a[@class=\"storeDirectLink\"]//span")
	WebElement Store1;

	/* x-path for Visit Asian Paint option */
	@FindBy(xpath = "//a[@href=\"https://www.asianpaints.com/store-locator.html\"][text()=\"Visit Asian Paints\"]")
	WebElement Visit1;

	/* id for pincode */
	@FindBy(id = "search-input")
	WebElement Pincode1;

	/* x-path for button */
	@FindBy(xpath = "//a[@class=\"ctaText position-relative search-by-pin woosmap-search-by-pin\"]//span[1]")
	WebElement Button1;

	/* x-path for dropdown list */
	@FindBy(xpath = "//legend[@class=\"text-uppercase m-0\"]")
	WebElement Dropdown1;

	/* x-path using text for selecting checkbox */
	@FindBy(xpath = "//span[text()=\"Paints\"]")
	WebElement Checkbox1;

	/* x-path for closing the checkbox */
	@FindBy(xpath = "//div[@class=\"js-items-collapsible-group-Block\"]/child::a/span")
	WebElement Close1;
	
	
	
	
	
	/*SCENARIO-2*/

	@FindBy(xpath = "//div[@class=\"centerAlign\"]/a[@href=\"https://www.asianpaints.com/apbeautifulhomes.html\"]")
	WebElement viewdetails2;

	@FindBy(xpath = "(//div[@class=\"form-group-global__enquire-form--elements-wrap track_field_focus\"]//input[@placeholder=\"Name*\"])[2]")
	WebElement name2;

	@FindBy(xpath = "(//div[@class=\"form-group-global__enquire-form--elements-wrap track_field_focus\"]//input[@placeholder=\"Email*\"])[2]")
	WebElement email2;

	@FindBy(xpath = "(//div[@class=\"form-group-global__enquire-form--elements-wrap track_field_focus\"]//input[@placeholder=\"Mobile*\"])[2]")
	WebElement number2;

	@FindBy(xpath = "(//div[@class=\"form-group-global__enquire-form--elements-wrap track_field_focus\"]//input[@placeholder=\"Pincode*\"])[2]")
	WebElement pincode2;

	/* x-path for submit button for making appointment */
	@FindBy(xpath = "//button[@class=\"ctaText enquireForm--step-1-submit track_form_submit\"]")
	WebElement button2;

	@FindBy(xpath = "//h2[@class=\"thankYouTitle\"]")
	WebElement msg2;
	

	
	
	
	
	
	/*SCENARIO-3*/
	
	@FindBy(xpath="//a[@data-target=\"#INSPIRATION\"]//span[1]")
    WebElement inspiration3;
    
    
    @FindBy(xpath="//a[@href=\"https://www.asianpaints.com/blogs.html\"][1]")
    WebElement blogs3;
    
     
    @FindBy(xpath="//a[@href=\"https://www.asianpaints.com/blogs.html\"][text()=\"Visit Asian Paints\"]")
    WebElement visit3;
    
   
    @FindBy(xpath="(//span[@class=\"form-checkbox-input__custom--check track_blog_select\"])[1]")
    WebElement category3;
   
    
    @FindBy(xpath="//select[@name=\"sortBy\"]")
    WebElement sort3;
    
    
    
    
    
    /*SCENARIO-4*/
    
    /*x-path for shop option*/
	@FindBy(xpath="(//span[@class=\"iconTextLinks__text visible-in-Desktop\"])[6]")
	WebElement shop4;
	
	/*x-path for wallSticker option*/
	@FindBy(xpath="(//a[@href=\"https://www.asianpaints.com/online-shop/wall-stickers.html\"])[1]")
	WebElement wallsticker4;
	
	/*x-path of image of product*/
	@FindBy(xpath="//a[@target=\"_blank\"]//img[@title=\"Exotic Flowers Wall Sticker\"]")
	WebElement image4;
	
	/*x-path for reviewBox*/
	@FindBy(xpath="//a[text()=\"Write a Review\"]")
	WebElement reviewBox4;
	
	/*id for entering mobileNumber*/
	@FindBy(id="loginMobile")
	WebElement login4;
	
	/*x-path submitting mobileNumber*/
	@FindBy(xpath="(//div[@class=\"ctaComp baseBtn\"]//button)[2]")
	WebElement submit4;
	
	/*id for adding review*/
	@FindBy(id="prodUserComment")
	WebElement review4;
	
	/*x-path for submit button*/
	@FindBy(xpath="//button[@class=\"ctaText validate-login  modal__variant-login--submit\"]")
	WebElement button4;
	
	/*x-path for selecting rating*/
	@FindBy(xpath="(//label[@class=\"star-5\"])[3]")
	WebElement rating4;
	
	/*x-path for submiting review*/
	@FindBy(xpath="//button[@class=\"global-button review-rating-submit\"]")
	WebElement reviewSubmit4;
	
	
	/*x-path for review message*/
	@FindBy(xpath="(//span[@class=\"modal__variant-login--login-text\"])[2]")
	WebElement message4;
	
	 
    
    
	/*SCENARIO-5*/
	
	/*x-path for Shop option*/
	@FindBy(xpath="//a[@data-target=\"#SHOP\"]")
	WebElement shop5;
	
	/*x-path for selecting DIY Tools*/
	@FindBy(xpath="//a[@href=\"https://www.asianpaints.com/online-shop/Buy-DIY-Tools.html\"]")
	WebElement tools5;
	
	/*x-path of image of product*/
	@FindBy(xpath="//img[@alt=\"Measuring Tape 5m\"]")
	WebElement image5;
	
	/*x-path of quantity option*/
	@FindBy(xpath="//label[@class=\"qty-label\"]")
	WebElement quantity5;
	
	/*x-path for changing quantity*/
	@FindBy(xpath="//ul[@class=\"dropdown-item-list js-dropdownItemList\"]")
	WebElement quantityChange5;
	
	
	

    
    
    
    

//-----------------------------/*METHODS FOR LOCATING ELEMENTS*/------------------------------------------------------------------//

	/*SCENARIO-1*/
	
	
	
	public void ClickStore1() {
		Store1.click();
	}

	public void ClickVisit1() {
		Visit1.click();
	}

	public void scroll1() /* METHOD FOR SCROLLING DOWN */
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,400)");
	}

	public void SwitchToPin1() { /* METHOD FOR WINDOW HANDLE */

		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);

			}
		}
	}

	public void Pin1(String code) throws InterruptedException /* METHOD FOR ENTERING PINCODE */
	{
		// Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(Pincode1));
		Pincode1.click();
		Pincode1.clear();
		Pincode1.sendKeys(code);
	}

	public void ClickButton1() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Button1);

	}

	public void DropdownButton1() /* METHOD FOR DROPDOWN LIST */
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(Dropdown1));
		Dropdown1.click();
	}

	public void SelectCheckbox1() /* METHOD FOR SELECTING CHECKBOX */
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Checkbox1);
	}

	public void ClickClose1() {
		Close1.click();

	}

//---------------------------------------------------**----------------------------------------------------------------//

	/*SCENARIO-2*/
	
	
	public void scrollUp2() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,-400)");
	}

	public void clickViewDetails2() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", viewdetails2);
	}

	public void scrolldown2() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,800)");
	}

	public void enterdetails2(String Name, String Email, String MobileNumber, String Pincode) {
		name2.sendKeys(Name);
		email2.sendKeys(Email);
		number2.sendKeys(MobileNumber);
		pincode2.sendKeys(Pincode);
	}

	public void click_button2() {
		button2.click();
	}

	public String getmsg() throws InterruptedException {
		// Thread.sleep(2000);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(msg2));
		return msg2.getText();

	}
	
//------------------------------------------------------------------------------------------------------
	
	/*SCENARIO-3*/
	
	public void hoverInspiration3()   //Method for hovering on inspiration option using action
	  {
		  act=new Actions(driver);
		  act.moveToElement(inspiration3).build().perform();
	  }
	  
	  public void clickBlogs3()
	  {
		  js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", blogs3); 
	  }
	  public void clickVisit3()
	  {
		  js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", visit3); 
		 
	  }
	  public void clickCategory3()
	  {
		  wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(category3));
		  
		  js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", category3); 
	  }

	  public void selectSortBy3() throws InterruptedException
	   {
		  //Thread.sleep(1000);
		  wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		    wait.until(ExpectedConditions.visibilityOf(sort3));
		  select=new Select(sort3);       //Method for selecting option from sort option using select 
		  select.selectByValue("old");
				  
	  }
//------------------------------------------------------------------------------------------------------
	  
	  /*SCENARIO-4*/
	  
	  public void hoverShop4()
		{
			Actions act=new Actions(driver);
			act.moveToElement(shop4).build().perform();
		}
		
		public void clickWallSticker4()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", wallsticker4); 
		}
		
		
		public void clickImage4()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", image4);
			  
		}
		
		
		public void scrollDown4()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
		 	js.executeScript("window.scroll(0,3000)");
		}
		public void clickReview4() throws InterruptedException
		{

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", reviewBox4);
			Thread.sleep(2000);

		}
		
		public void login(String mobile)
		{
			login4.sendKeys(mobile);
		}
		
		public void submitClick4() 
		{
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", submit4);
		}
		
		public void submitButton4() throws InterruptedException
		{
			Thread.sleep(15000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", button4);
		}
		
		
		public void enterReview4() throws InterruptedException
		{
			driver.switchTo().parentFrame();
			
			Thread.sleep(2000);
			
			review4.sendKeys("Good Product");
			
		}
		
		public void scrollUp4()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
		 	js.executeScript("window.scroll(0,-200)");
		}
		
		public void selectRatings4() throws InterruptedException
		
		{
			
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", rating4);
		}
		
		
		
		public void submitReviewOption() throws InterruptedException
		{
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", reviewSubmit4);
		}
		
		public String reviewMessageDisplay4() throws InterruptedException
		{
			Thread.sleep(1000);
			return message4.getText();
		}
//----------------------------------------------------------------------------------------------
		
		/*SCENARIO-5*/

		public void hoverShop5()
		{
			 act=new Actions(driver);
				act.moveToElement(shop5).build().perform();
		}
		
		public void clickTools5()
		{
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", tools5); 
		}
		public void scrollDown5()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
		 	js.executeScript("window.scroll(0,400)");
		}
		
	   public void clickImage5() throws InterruptedException
	   {
		  Thread.sleep(1000);
		   JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", image5); 

	   }
	   public void SwitchToNextPage() {
			String mainWindowHandle = driver.getWindowHandle();
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String handle : allWindowHandles) {
			    if (!handle.equals(mainWindowHandle)) {
			        driver.switchTo().window(handle);
			        break;

			    }
			}
		}
	   public void scroll_down5()
	   {
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		 	js.executeScript("window.scroll(0,400)");
	   }
		
	  public void clickQuantity5()
	  {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", quantity5); 
	  }
	   
	  public String selectQuantityChange5() throws InterruptedException
		{
			Thread.sleep(1000);
			return quantityChange5.getText();
		}
	}

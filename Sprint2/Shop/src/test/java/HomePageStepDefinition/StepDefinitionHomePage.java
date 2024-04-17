package HomePageStepDefinition;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DriverSetup.SetupDriver;
import HomePageFactory.PageFactory1;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionHomePage {

	
	static WebDriver driver;
	PageFactory1 page;
//	PageFactory2 page2;
//	PageFactory3 page3;
//	PageFactory4 page4;
//	PageFactory5 page5;
/*---------------------------------------------------------------------------------------------------------------*/

	/* Scenario 1 */
	
	/*Calling methods in StepDefinition page*/

	@Given("User is on HOMEPAGE")
	public void user_is_on_homepage() {
		driver = SetupDriver.chromedriver();
		page = new PageFactory1(driver);
	}

	@When("User clicks FIND ASIAN PAINTS STORE option and lands to STORE LOCATOR page")
	public void user_clicks_find_asian_paints_store_option_and_lands_to_store_locator_page()
			throws InterruptedException {
		
		page.ClickStore1();
		page.ClickVisit1();
		page.SwitchToPin1();     
		Thread.sleep(1000);
		page.scroll1();
	}

	@And("^User is able to enter the (.*)")
	public void user_is_able_to_enter_the(String code) throws InterruptedException {
		Thread.sleep(1000);
		page.Pin1(code);
	}

	@And("User is able to click on button")
	public void user_is_able_to_click_on_button() {
		page.ClickButton1();
	}

	@And("User is able to select product from dropdown of SELECT PRODUCTS & SERVICES")
	public void user_is_able_to_select_product_from_dropdown_of_select_products_services() throws InterruptedException {
		page.DropdownButton1();
		page.SelectCheckbox1();
		Thread.sleep(1000);
		page.ClickClose1();
	}

	@Then("User finds the shop near by the pincode entered area and is able to select product type") //Assert scenario output using URL
	public void user_finds_the_shop_near_by_the_pincode_entered_area_and_is_able_to_select_product_type() {
		Assert.assertEquals("https://www.asianpaints.com/store-locator.html", driver.getCurrentUrl());
	}

/*----------------------------------------------**----------------------------------------------------------*/

	/* Scenario 2 */

	@Given("User is on store locator page")
	public void user_is_on_store_locator_page() {
		driver = SetupDriver.chromedriver();
		driver.get("https://www.asianpaints.com/store-locator.html");
		page = new PageFactory1(driver);
		

	}

	@When("User is able to click on VIEW DETAILS option and lands to book an appointment page")
	public void user_is_able_to_click_on_view_details_option_and_lands_to_book_an_appointment_page() {
		page.scrollUp2();
		page.clickViewDetails2();
	//	page.SwitchToPin1();
		page.scrolldown2();
		
		
	}

	@And("^User is able to fill details (.*), (.*) , (.*) and (.*)$")
	public void user_is_able_to_fill_details_and(String Name, String Email, String MobileNumber, String Pincode) {
		page.enterdetails2(Name, Email, MobileNumber, Pincode);
	}

	@And("User is able to click on BOOK AN APPOINTMENT option")
	public void user_is_able_to_click_on_book_an_appointment_option() {
		page.click_button2();
	}

	@Then("User is able to book appointment and get to the successfull booking appointment page")
	public void user_is_able_to_book_appointment_and_get_to_the_successfull_booking_appointment_page()
			throws InterruptedException {
		String Title = "Thank you!";    //Assert to verify the output of scenario using title
		String verifyTitle = page.getmsg();
		Assert.assertEquals(Title, verifyTitle);
	}

	
/*-----------------------------------------------------**--------------------------------------------------------------*/
	
	
	/* Scenario 3 */

	@Given("User is on home page of Asian Paint")
	public void user_is_on_home_page_of_asian_paint() {
		driver = SetupDriver.chromedriver();
		page = new PageFactory1(driver);
	
	}

	@When("User is able to hover on INSPIRATION")
	public void user_is_able_to_hover_on_inspiration() throws InterruptedException {
		page.hoverInspiration3();

	}

	@And("Click on BLOGS option and lands to the page of blog option")
	public void click_on_blogs_option_and_lands_to_the_page_of_blog_option() {
		page.clickBlogs3();
		page.clickVisit3();
	}

	@And("User is able to select the filters by clicking on CATEGORY dropdown option")
	public void user_is_able_to_select_the_filters_by_clicking_on_category_dropdown_option() {
		page.clickCategory3();
	}

	@And("User is able to view old prodcuts by selecting SORT BY  option")
	public void user_is_able_to_view_old_prodcuts_by_selecting_sort_by_option() throws InterruptedException {
		page.selectSortBy3();
	}

	@Then("User gets the updated list of products")  //Assert scenario output by URL
	public void user_gets_the_updated_list_of_products() {
		Assert.assertEquals("https://www.asianpaints.com/blogs.html?f=Category%3Adecor", driver.getCurrentUrl());
	}
	
	
/*-------------------------------------------------**---------------------------------------------------------------*/
	
	
/* Scenario 4 */

	@Given("User is on homepage of Asian Paint site")
	public void user_is_on_homepage_of_asian_paint_site() {
		driver = SetupDriver.chromedriver();
		page = new PageFactory1(driver);
		
	}

	@When("User hovers on the SHOP functionality and selects option PEEL & STICK WALLPAPERS")
	public void user_hovers_on_the_shop_functionality_and_selects_option_peel_stick_wallpapers() {
	    page.hoverShop4();
	    page.clickWallSticker4();
	}

	@And("User clicks on the product image and lands to the new page")
	public void user_clicks_on_the_product_image_and_lands_to_the_new_page() {
	    page.clickImage4();
	    page.SwitchToNextPage();
		
	}

	@And("User scrolls down the page and clicks on WRITE A REVIEW")
	public void user_scrolls_down_the_page_and_clicks_on_write_a_review() throws InterruptedException {
	    Thread.sleep(1000);
		page.scrollDown4();
		Thread.sleep(1000);
		page.clickReview4();	
	    
	}
	@And("User enters the mobile number and click on SUBMIT")  
	public void user_enters_the_mobile_number_and_click_on_submit(DataTable dataTable)  {
		List<List<String>> cells = dataTable.cells();
		page.login(cells.get(0).get(0));
		page.submitClick4();
	}

	@And("Enter otp and click on SUBMIT")
	public void enter_otp_and_click_on_submit() throws InterruptedException {
	    page.submitButton4();
	}

	@And("User writes a review and clicks on SUBMIT button")
	public void user_writes_a_review_and_clicks_on_submit_button() throws InterruptedException {
	    page.enterReview4();
	    page.scrollUp4();
	}

	@And("User can give ratings to the product by clicking on stars option")
	public void user_can_give_ratings_to_the_product_by_clicking_on_stars_option() throws InterruptedException {
	   page.selectRatings4();
	   page.submitReviewOption();
	}

	@Then("User is able to add review and ratings on the product")
	public void user_is_able_to_add_review_and_ratings_on_the_product() throws InterruptedException {
		String Title = "Thank you – Review Submitted.";  //Assert to verify the output of scenario using title
		String verifyTitle = page.reviewMessageDisplay4();
		Assert.assertEquals(Title, verifyTitle);
	}
	
	
/*---------------------------------------------------------**----------------------------------------------------------*/
	
	
	/*Scenario 5 */

	@Given("User is on homepage of Asian Paint website")
	public void user_is_on_homepage_of_asian_paint_website() {
		driver = SetupDriver.chromedriver();
		page = new PageFactory1(driver);
		
	}

	@When("User hovers on SHOP functionality and clicks on DIY TOOLS")
	public void user_hovers_on_shop_functionality_and_clicks_on_diy_tools() {
	    page.hoverShop5();
	    page.clickTools5();
	}

	@And("User clicks on the image from product list and lands to the descriptive page of it")
	public void user_clicks_on_the_image_from_product_list_and_lands_to_the_descriptive_page_of_it() throws InterruptedException {
	   page.scrollDown5();
		page.clickImage5();
		page.SwitchToNextPage();
	}

	@And("User selects the quantity from the below dropdown list of QUANTITY")
	public void user_selects_the_quantity_from_the_below_dropdown_list_of_quantity() {
	    page.scroll_down5();
	    page.clickQuantity5();
	}

	@Then("User is able to view quantity more than {int} and able to select it.")
	public void user_is_able_to_view_quantity_more_than_and_able_to_select_it(Integer int1) throws InterruptedException {
		
		String Title = "2";     //Assert to verify the output of scenario using title
		String verifyTitle = page.selectQuantityChange5();
		Assert.assertEquals(verifyTitle,Title);
	}
	
	
	
/*---------------------------------------------**----------------------------------------------------------------*/
	
	
/* For generating  screenshots */

@AfterStep
	public static void takeScreendown(Scenario scenerio) {
	
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}}


/*-----------------------------------------------------------------------------------------------------------------*/
Feature: To check the functionality of home page to explore things

  @FindStore
  Scenario Outline: To validate that user is able to click on find store nearby to the customer's location and selects the product type from below dropdown list of SELECT PRODUCTS & SERVICES
  Given User is on HOMEPAGE
  When User clicks FIND ASIAN PAINTS STORE option and lands to STORE LOCATOR page
  And User is able to enter the <PINCODE>
  And User is able to click on button
  And User is able to select product from dropdown of SELECT PRODUCTS & SERVICES
  Then User finds the shop near by the pincode entered area and is able to select product type
  
  Examples:
  |PINCODE|
  |453441|
  #//--------------------------------------------------------------------------------------------------------------------//#
  @MakeAppointment
  Scenario Outline:To validate that user is able to enter details for booking an appointment
  Given User is on store locator page
  When User is able to click on VIEW DETAILS option and lands to book an appointment page
  And User is able to fill details <Name>, <Email> , <MobileNumber> and <Pincode>
  And User is able to click on BOOK AN APPOINTMENT option
  Then User is able to book appointment and get to the successfull booking appointment page
  
  
  Examples:
  |Name|       |Email|                              |MobileNumber|   |Pincode|
  |Deepika|    |deepikaghildiyal2001@gmail.com|     |7489654824|     |453441|
  
  
  
  #//------------------------------------------------------------------------------------------------------------------//#
  
  @BlogFilter
  Scenario: To validate that user is able to select filters of blog option and get the updated list of products
  Given User is on home page of Asian Paint
  When User is able to hover on INSPIRATION
  And Click on BLOGS option and lands to the page of blog option
  And User is able to select the filters by clicking on CATEGORY dropdown option
  And User is able to view old prodcuts by selecting SORT BY  option
  Then User gets the updated list of products
  #//-------------------------------------------------------------------------------------------------------------------//#
  #//--------------------------------------------------------------------------------------------------------------//
  @Writereview
  Scenario:To validate that user is able to add review and give rating on the product
  Given User is on homepage of Asian Paint site
  When User hovers on the SHOP functionality and selects option PEEL & STICK WALLPAPERS
  And User clicks on the product image and lands to the new page
  And User scrolls down the page and clicks on WRITE A REVIEW
  And User enters the mobile number and click on SUBMIT
  |7489654824|
  And Enter otp and click on SUBMIT
  And User writes a review and clicks on SUBMIT button
  And User can give ratings to the product by clicking on stars option
  Then User is able to add review and ratings on the product
  
  #//-------------------------------------------------------------------------------------------------------------------
  
  @Defect
  Scenario: To validate that user is able to view and select quantity of product
    Given User is on homepage of Asian Paint website
    When User hovers on SHOP functionality and clicks on DIY TOOLS
    And User clicks on the image from product list and lands to the descriptive page of it
    And User selects the quantity from the below dropdown list of QUANTITY
    Then User is able to view quantity more than 1 and able to select it.

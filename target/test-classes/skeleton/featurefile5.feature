Feature: Testing for registration

Scenario: Registration process

Given User opens the IE browser and launches the  TestMe application
When User enters Username as "Shraddha123456" in usename field
And User enters Firstname as "Shraddha" in firstname field
And User enters Lastname as "Bhomaj" in lastname field
And User enters Password as "TestMe123" in password field
And User enters Confirm Password as "TestMe123" in confirm password field
And user selects gender as Female from the gender field
And user enters the EmailID "shr@gamil.com" as in email field
And user enters the Mobile number "9995656334" in mobile number field
And user selects the DOB "5/10/1997" from DOB field
And user enters the Address as "Hinjewadi" in address field
And user selects security as "What is your favour color" question
And user enters the Answer as "Black"  in answer field
And user clicks on register
Then user registration is successful

Feature: Open the Browser

  Scenario Outline: 
  	Given User launch the "<browser>" Browser
  	When User Launch Url
  	And Click MyBizAcc
  	And Userone "<EmailID>"
  	When Click Continue
  	When Click MyBizAcc
  	And Usertwo Enter "<password>"
  	And UserThree Click Login
  	When Click on Train Booking
    And Click From 
    And User Enterfour "<from>"
    When EnterFive To "<Location>"
    And Selectone Travel Date
    And Selecttwo class
    When Selectthree Your Station
    
   Examples:

     |  browser   |     username             |  password  |
     | Chrome     | Dharakasundar8@gmail.com | GayaSun1@2 |
     |  edge      | Dharakasundar8@gmail.com | GayaSun1@2 |
     
     
              
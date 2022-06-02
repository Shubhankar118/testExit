Feature: appium Appium Automation
  This is for appium mobile testing

  Scenario Outline: ForthPage
    Given Open the emulator
    When the user click on Views
    And user click on Search view
    Then the user click on Action Bar
    And user again click on searcH
    Then user enter the <Search>
    
    
    
    
    
    Examples: 
    |Search        |
    |Action bar    |
     
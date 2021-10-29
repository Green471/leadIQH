@endToEnd
Feature: end to end workflow

  Scenario Outline: Register new users
    Given user is on the registration page
    And user enters workemail "<workemail>" and click on the privacy check box and click on the continue button
    Then the user should be able to see "<Invitation message>" message
    Then the user klicks on the invite link
    Then user enters firstname and lastname as "<firstname>" and "<lastname>"
    When user provides a password "<password>"
    Then user klicks on roledescription box end selects the best description
    Then user click mobilephone as "<mobilephone>"
    And the user click on the continue button
          #But if user enters invalid email sould be able to see "<invalid email>"
          #Then the user click on the login button
            # When user provides a password "<password>"

    Examples:
      |workemail|Invitation message|firstname|lastname|password|mobilephone|
      |yesiladil27@googlemail.com|Invitation Sent|adil|yesil|asdf3321|+1718-598-7855|

  Scenario Outline: go to create a team workspace
    Given user enters company name "<companyName>"
    And user provides workspace name "<workspaceName>"
    Then user selects company size  from dropdown button
    Then the user chooses the CRM tool they use
    Then the user chooses the sales engagement they use
    Then the user Specifies whether the user is using the LinkedIn sales navigator.
    Then user click the Continue button
    Then user chooses where she or he wants to save his or her prospects
    And user klick on the next buttom and then click on the continue
    And The user clicks the Install button to install the extension.
    And user clicks on the Add to chrome button
  And User verifies whether the LeadIQ extension has been successfully installed


    Examples:
      |companyName|workspaceName|
      |greentech123|QA Tester|
    #------------------------------------------------------------------
 # Scenario Outline: create a new account
  #  When user clicks on manageAccount
   # Then user creates a new account
    #Given user types a description "<description>"
#    And user types the balance as "<balance>"
#    Then user selects an account type from dropdown "<accountType>"
#    When user selects an accountStatusType "<accountStatusType>"
#    Then user clicks on save button
#    Examples: all data
 #     |description|balance|accountType|accountStatusType|
#      |Instructor saving account|10000|CHECKING|ACTIVE  |
#      |Instructor checking account|2000|SAVING|ACTIVE|
  #    |utilisateur4 saving account|2000|SAVING|ACTIVE|

 # Scenario Outline: create a new customer
 #   And user navigates to my operations
 #   When user clicks on manageCustomer
 #   Then user creates a customer
 #   And user types the ssn as "<SSNsearch>"
 #   And user clicks on the searchbox
 #   When user types the firstname as "<firstName>"
 #   Then user also types the lastname as "<lastName>"
 #   And user provides the middle initial as "<midleInitial>"
 #   And user types the email id as "<email>"
 #   Then user types the mobilePhoneNumber as "<mobilePhoneNumber>"
 #   When user types the actual phone number as "<phoneNumber>"
 #   And user types the zipCode as "<zipCode>"
 #   Then user the address as "<address>"
 #   And user types the city as "<city>"
 #   And user types the same ssn as "<SSN>"
 #   When user selects a country as "<countryName>"
 #   And user types the state name as "<state>"
 #   When user selects an account from dropdown as "<accountDropdown>"
 #   Then user clicks on save button
 #   Examples: all data
 #     |SSNsearch|firstName|lastName|midleInitial|email|mobilePhoneNumber|phoneNumber|zipCode|address|city|SSN|countryName|state|accountDropdown|
 #     |569-86-9023|utilisateur4|prenom2|u|utilisateur4@gmail.com|798-898-8855|798-898-8855|22180|New ville|GreensBoro|569-86-9023|UNITED STATES|NC|utilisateur4 saving account|

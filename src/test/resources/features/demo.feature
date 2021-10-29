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

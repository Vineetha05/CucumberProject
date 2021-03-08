Feature: Verify the Adactin login details.

  Scenario Outline: verify the Adactin login with valid credentials.
    Given User is on Adactin login page.
    When User enters the valid "<username>" and "<password>".
    Then User should click on login button.

    Examples:
    | username | password |
    | Vineetha | 58HN9Z   |
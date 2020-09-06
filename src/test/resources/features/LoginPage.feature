Feature: To validate the Orange HRM Login page

Scenario Outline: To validate the login page in orange hrm
Given Get the login page title
Then Enter username "<username>"
Then Enter password "<password>" and click login button
And Get the title of the login page
And close the browser

Examples:
|username|password|
|Admin|admin125|
|Admin|admin123|
Feature: CucumberJava

Scenario Outline: Login functionality exists

Given I have open the browser
| chrome |
| IE     |
When I open Facebook website
And Write "<text>" in username field
Then Close the bowser
Examples:
| text |
| ABC  |
| DEF  |
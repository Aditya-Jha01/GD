$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('CucumberJava\Testing.feature');
formatter.feature({
  "line": 1,
  "name": "CucumberJava",
  "description": "",
  "id": "cucumberjava",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login functionality exists",
  "description": "",
  "id": "cucumberjava;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.openBrowser()"
});
formatter.result({
  "duration": 3925955800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.goToFacebook()"
});
formatter.result({
  "duration": 1647056600,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "HepsiBurada Registering",
  "description": "",
  "id": "hepsiburada-registering",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User registers by successfully completing the registration form",
  "description": "",
  "id": "hepsiburada-registering;user-registers-by-successfully-completing-the-registration-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@register"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "a web browser is at the Hepsiburada home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user click dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on the registration item",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user sees the registration form",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters the name",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters the surname",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the email",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click the agreement checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click submit button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "driver close",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.aWebBrowserIsAtTheHepsiburadaHomePage()"
});
formatter.result({
  "duration": 11009244416,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.theUserClickDropdown()"
});
formatter.result({
  "duration": 104239625,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.userClicksOnTheRegistrationItem()"
});
formatter.result({
  "duration": 864816584,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.userSeesTheRegistrationForm()"
});

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/NewPayment.feature");
formatter.feature({
  "name": "New Payment",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NewPayment"
    }
  ]
});
formatter.scenario({
  "name": "Login to the application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NewPayment"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_Launch_Chrome_browser() in file:/home/madhuri/Desktop/DailyWorkSpace/PC-Cucumber/automation/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"http://localhost:4200/login/pt\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_Opens_URL(String) in file:/home/madhuri/Desktop/DailyWorkSpace/PC-Cucumber/automation/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on InitialLogin",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_on_InitialLogin() in file:/home/madhuri/Desktop/DailyWorkSpace/PC-Cucumber/automation/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Email as \"mark@pointchain.io\" and Password as \"pointchain\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_enter_Email_as_and_Password_as(String,String) in file:/home/madhuri/Desktop/DailyWorkSpace/PC-Cucumber/automation/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_on_Login() in file:/home/madhuri/Desktop/DailyWorkSpace/PC-Cucumber/automation/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
});
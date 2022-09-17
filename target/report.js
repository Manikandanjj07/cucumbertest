$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobileValidation.feature");
formatter.feature({
  "name": "Mobile Validation Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Mobile"
    }
  ]
});
formatter.scenario({
  "name": "Mobile Validation Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Mobile"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "lauching Flipkart",
  "keyword": "Given "
});
formatter.match({
  "location": "MobileValidation.lauching_Flipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login \"9842642468\", \"Prajinkuti\"",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidation.login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search mobile \"iPhone\"",
  "keyword": "When "
});
formatter.match({
  "location": "MobileValidation.search_mobile(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click first product",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidation.click_first_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "window handles",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidation.window_handles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "browser close",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileValidation.browser_close()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
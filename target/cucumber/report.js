$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("outline.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon login scenarios",
  "description": "",
  "id": "amazon-login-scenarios",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 4,
  "name": "User navigates to Amazon",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Amazon login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.goToAmazon()"
});
formatter.result({
  "duration": 11420319035,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 8,
      "value": "#Scenario with xml data"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "id": "amazon-login-scenarios;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I enter Username and Password from file at \"resources\\\\data.xml\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "resources\\\\data.xml",
      "offset": 44
    }
  ],
  "location": "LoginTest.enterUserPwd(String)"
});
formatter.result({
  "duration": 21762956677,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.checkFail()"
});
formatter.result({
  "duration": 2290990988,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 14,
      "value": "#Scenario outline exapmle1"
    }
  ],
  "line": 15,
  "name": "",
  "description": "",
  "id": "amazon-login-scenarios;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I enter Username as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "amazon-login-scenarios;;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 19,
      "id": "amazon-login-scenarios;;;1"
    },
    {
      "cells": [
        "Tom",
        "jerry"
      ],
      "line": 20,
      "id": "amazon-login-scenarios;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 4,
  "name": "User navigates to Amazon",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Amazon login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.goToAmazon()"
});
formatter.result({
  "duration": 8739020281,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "",
  "id": "amazon-login-scenarios;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I enter Username as \"Tom\" and Password as \"jerry\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Tom",
      "offset": 21
    },
    {
      "val": "jerry",
      "offset": 43
    }
  ],
  "location": "LoginTest.enterUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 6228031281,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.checkFail()"
});
formatter.result({
  "duration": 2262503344,
  "status": "passed"
});
});
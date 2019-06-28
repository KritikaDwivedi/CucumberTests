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
  "duration": 11188431441,
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
  "duration": 21872984692,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.checkFail()"
});
formatter.result({
  "duration": 42811751,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[abc]\u003e but was:\u003c[def]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat Tests.LoginTest.checkFail(LoginTest.java:90)\r\n\tat ✽.Then Login should fail(outline.feature:11)\r\n",
  "status": "failed"
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
  "duration": 15142497768,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 37,
      "value": "#Scenario with data table"
    }
  ],
  "line": 38,
  "name": "",
  "description": "",
  "id": "amazon-login-scenarios;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "I enter username",
  "rows": [
    {
      "cells": [
        "tom"
      ],
      "line": 40
    },
    {
      "cells": [
        "kritika"
      ],
      "line": 41
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "I enter password",
  "rows": [
    {
      "cells": [
        "jerry"
      ],
      "line": 43
    },
    {
      "cells": [
        "dwivedi"
      ],
      "line": 44
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.I_enter_username(DataTable)"
});
formatter.result({
  "duration": 6337869371,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_enter_password(DataTable)"
});
formatter.result({
  "duration": 7803191810,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.checkFail()"
});
formatter.result({
  "duration": 12974512,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[abc]\u003e but was:\u003c[def]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat Tests.LoginTest.checkFail(LoginTest.java:90)\r\n\tat ✽.Then Login should fail(outline.feature:45)\r\n",
  "status": "failed"
});
});
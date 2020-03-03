$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeaturesFiles/CustomerSearch.feature");
formatter.feature({
  "name": "CuctomerSearch",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Folowing are the common steps for All scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open Url \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_open_Url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enter_Email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_can_view_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_click_on_customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customer menu item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_customer_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search customer by first and last name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user enter firstName",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enter_firstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter lastName",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enter_lastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should find first and last in the search table",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_should_find_first_and_last_in_the_search_table()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//table[@id\u003d\u0027customers-grid\u0027]/tbody/tr[1]/td[3]\"}\n  (Session info: chrome\u003d80.0.3987.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MAYUR-PC\u0027, ip: \u0027192.168.43.203\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 80.0.3987.16 (320f6526c1632..., userDataDir: C:\\Users\\Mayur\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:62375}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 54091002bfc54830a2696677d3f786b1\n*** Element info: {Using\u003dxpath, value\u003d//table[@id\u003d\u0027customers-grid\u0027]/tbody/tr[1]/td[3]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pageObjects.SearchCustomerPage.searchCustomerByName(SearchCustomerPage.java:134)\r\n\tat stepDefinitions.Steps.user_should_find_first_and_last_in_the_search_table(Steps.java:248)\r\n\tat ✽.user should find first and last in the search table(file:///C:/Users/Mayur/eclipse-workspace/Seleniumcucumber/./FeaturesFiles/CustomerSearch.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:FeaturesFiles/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successfully Login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.step({
  "name": "user open Url \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enter Email as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "name": "pageTitle should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on log out page",
  "keyword": "When "
});
formatter.step({
  "name": "Page Title shoub be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "passwor"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successfully Login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open Url \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_open_Url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Email as \"admin@yourstore.com\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enter_Email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pageTitle should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.pagetitle_should_be(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat stepDefinitions.Steps.pagetitle_should_be(Steps.java:93)\r\n\tat ✽.pageTitle should be \"Dashboard / nopCommerce administration\"(file:///C:/Users/Mayur/eclipse-workspace/Seleniumcucumber/./FeaturesFiles/Login.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on log out page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_click_on_log_out_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page Title shoub be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.page_Title_shoub_be(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Successfully Login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open Url \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_open_Url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Email as \"admin@yourstore.com\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enter_Email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pageTitle should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.pagetitle_should_be(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat stepDefinitions.Steps.pagetitle_should_be(Steps.java:93)\r\n\tat ✽.pageTitle should be \"Dashboard / nopCommerce administration\"(file:///C:/Users/Mayur/eclipse-workspace/Seleniumcucumber/./FeaturesFiles/Login.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on log out page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_click_on_log_out_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page Title shoub be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.page_Title_shoub_be(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});
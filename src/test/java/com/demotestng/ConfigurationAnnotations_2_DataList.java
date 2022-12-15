package com.demotestng;

import org.testng.annotations.*;

@Test(groups = "smoke")
public class ConfigurationAnnotations_2_DataList {

    @BeforeGroups(groups = {"regression","smoke"})
    public void beforeGroups(){
        System.out.println("Execute before groups");
    }

    @AfterGroups (groups = {"regression","smoke"})
    public void afterGroups(){
        System.out.println("Execute after groups");
    }
    public void test3_BootstrapListBox(){
        System.out.println("     (5) Test Method 1: Bootstrap List Box");
    }


    public void test4_JQueryListBox(){
        System.out.println("     (5) Test Method 1: JQuery List Box");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("    (4) Execute before each test method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("    (4) Execute after each test method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("   (3) Executed before class: List Box");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("   (3) Execute after class: List Box");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("  (2) Execute before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("  (2) Execute after test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println(" (1) Execute before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println(" (1) Execute after Suite");
    }
}

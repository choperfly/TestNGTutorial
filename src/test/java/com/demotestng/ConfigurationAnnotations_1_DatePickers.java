package com.demotestng;

import org.testng.annotations.*;

public class ConfigurationAnnotations_1_DatePickers {
    @Test(groups = "smoke")
    public void test1_BootstrapDataPicker(){
        System.out.println("     (5) Test Method 1: Bootstrap Date Picker..");
    }

    @Test(groups = {"regression","smoke"})
    public void test1_JQueryDataPicker(){
        System.out.println("     (5) Test Method 1: JQuery Date Picker");
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
        System.out.println("   (3) Executed before class: Date Picker");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("   (3) Execute after class: Date Picker");
    }
}

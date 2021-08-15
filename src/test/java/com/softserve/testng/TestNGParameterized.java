package com.softserve.testng;

import org.testng.annotations.*;

public class TestNGParameterized {
    public void beforeSuite() {
        System.out.println("class TestNGParameterized, @BeforeSuite beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("class TestNGParameterized, @AfterSuite afterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\tclass TestNGParameterized, @BeforeTest beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\tclass TestNGParameterized, @AfterTest afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("\t\tclass TestNGParameterized, @BeforeClass beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("\t\tclass TestNGParameterized, @AfterClass afterClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\t\t\tclass TestNGParameterized, @BeforeMethod beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\t\t\tclass TestNGParameterized, @AfterMethod afterMethod");
    }


    @Test
    @Parameters(value = "number")
    public void parameterInTest(int number) {
        System.out.println("\t\t\t\tclass parameterInTest, Number is: " + number);
    }
}

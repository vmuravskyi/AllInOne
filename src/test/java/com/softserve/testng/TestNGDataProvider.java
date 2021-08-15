package com.softserve.testng;

import org.testng.annotations.*;

import java.util.Vector;

public class TestNGDataProvider {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("class TestNGDataProvider, @BeforeSuite beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("class TestNGDataProvider, @AfterSuite afterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\tclass TestNGDataProvider, @BeforeTest beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\tclass TestNGDataProvider, @AfterTest afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("\t\tclass TestNGDataProvider, @BeforeClass beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("\t\tclass TestNGDataProvider, @AfterClass afterClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\t\t\tclass TestNGDataProvider, @BeforeMethod beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\t\t\tclass TestNGDataProvider, @AfterMethod afterMethod");
    }

    @DataProvider(name = "Data-Provider-Function")
    public Object[][] parameterIntTestProvider() {
        return new Object[][]{{Vector.class, new String[]{"java.util.AbstractList", "java.util.AbstractClass"}},
                {String.class, new String[]{"1", "2"}},
                {Integer.class, new String[]{"3", "4", "5"}}
        };
    }

    @Test(dataProvider = "Data-Provider-Function")
    public void DataProviderTest1(Class<?> clzz, String[] numbers) {
        System.out.println("clzz = " + clzz);
        for (String num: numbers) {
            System.out.println("num = "+num);
        }
    }
}

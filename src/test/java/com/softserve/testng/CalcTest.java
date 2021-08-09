package com.softserve.testng;

import com.softserve.edu.Calc;
import org.testng.annotations.*;
import org.testng.internal.thread.ThreadTimeoutException;

import java.util.concurrent.TimeoutException;

public class CalcTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("class CalcTest, @BeforeSuite beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("class CalcTest, @AfterSuite afterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\tclass CalcTest, @BeforeTest beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\tclass CalcTest, @AfterTest afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("\t\tclass CalcTest, @BeforeClass beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("\t\tclass CalcTest, @AfterClass afterClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\t\t\tclass CalcTest, @BeforeMethod beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\t\t\tclass CalcTest, @AfterMethod afterMethod");
    }

    @Test
    public void check1() {
        System.out.println("\t\t\t\tclass CalcTest, @Test check1");
    }

    @Test
    public void check2() {
        System.out.println("\t\t\t\tclass CalcTest, @Test check2");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        Calc c = new Calc();
        System.out.println("\t\t\t\tdivisionWithException");
        c.div(1, 0);
    }

    @Test(timeOut = 1000, expectedExceptions = ThreadTimeoutException.class)
    public void infinity() {
        System.out.println("Start");
        long startTime = System.currentTimeMillis();
        long currentTime = startTime;
        long displayTime = startTime;
        while ((currentTime - startTime) < 1100) {
            if ((currentTime - displayTime) > 100) {
                displayTime = currentTime;
                System.out.println("Working: " + (currentTime - startTime));
            }
            currentTime = System.currentTimeMillis();
        }
    }
}
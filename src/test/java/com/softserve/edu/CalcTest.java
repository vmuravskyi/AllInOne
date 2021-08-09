package com.softserve.edu;

import org.junit.*;

public class CalcTest {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass setUpBeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass tearDownAfterClass");
    }

    @Before
    public void setUp() {
        System.out.println("Before setUp");
    }

    @After
    public void tearDown() {
        System.out.println("After tearDown");
    }

    @Test
    public void add1() {

        //Precondition
        Calc systemUnderTest = new Calc();
        double expected;
        double actual;

        //Steps
        expected = 4;
        actual = systemUnderTest.add(2, 2);

        //Check
        Assert.assertEquals("Test 2 + 2 failed", expected, actual, 0.001);
    }

    @Test
    public void add2() {

        //Precondition
        Calc systemUnderTest = new Calc();
        double expected;
        double actual;

        //Steps
        expected = 5;
        actual = systemUnderTest.add(2, 3);

        //Check
        Assert.assertEquals("Test 2 + 3 failed", expected, actual, 0.001);
    }

    @Test
    public void div1() {

        //Precondition
        Calc systemUnderTest = new Calc();
        double expected;
        double actual;

        //Steps
        expected = 4;
        actual = systemUnderTest.div(20, 5);

        //Check
        Assert.assertEquals("Test 20 / 5 failed", expected, actual, 0.001);
    }

    @Test
    public void div2() {

        //Precondition
        Calc systemUnderTest = new Calc();
        double expected;
        double actual;

        //Steps
        expected = 2.5;
        actual = systemUnderTest.div(20, 8);

        //Check
        Assert.assertEquals("Test 20 / 8 failed", expected, actual, 0.001);
    }
}
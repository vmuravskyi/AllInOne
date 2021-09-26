//package com.softserve.testng;
//
//import com.softserve.edu.Calc;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//public class CalcTest2 {
//
//    @BeforeClass
//    public void beforeClass() {
//        System.out.println("\t\tclass CalcTest2, @BeforeClass beforeClass");
//    }
//
//    @AfterClass
//    public void afterClass() {
//        System.out.println("\t\tclass CalcTest2, @AfterClass afterClass");
//    }
//
//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("\t\t\tclass CalcTest2, @BeforeMethod beforeMethod");
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        System.out.println("\t\t\tclass CalcTest2, @AfterMethod afterMethod");
//    }
//
//
//    @Test
//    public void addTest() {
//        System.out.println("\t\t\t\tclass CalcTest2, @Test addTest");
//        Calc c = new Calc();
//        c.add(2, 2);
//        Assert.assertEquals(4, 4);
//    }
//}
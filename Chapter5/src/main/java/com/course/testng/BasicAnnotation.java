package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");

    }

    @Test
    public  void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMehod(){
        System.out.println("这是测试用例1前的测试方法");
    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("这是测试用例1后的测试方法");
    }

    @BeforeClass
    public void beforeClass(){

        System.out.println("beforeClass这是在类运行之前的方法");
    }

    @AfterClass
    public void afterClass(){

        System.out.println("afterClass这是在类运行之后的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite套件");
    }

}

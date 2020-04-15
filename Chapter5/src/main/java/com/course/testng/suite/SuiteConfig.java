package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suit 运行啦！！！！");
    }

    @AfterSuite
    public void aftersuit(){
        System.out.println("after suit 运行啦！！！");

    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void afterClass(){
        System.out.println("AfterTest");
    }
}

package com.course.testng.suite;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignoreTest(){
        System.out.println("Ignore1 执行");
    }

    public void ignoreTest2(){
        System.out.println("Ignore2 执行");
    }
}

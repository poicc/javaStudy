package com.soft.study.basic.annotation;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingServiceTest {

    @Test
    public void testGreetingService() {
        GreetingService greetingService = message -> System.out.println("Hello" + message);
        greetingService.sayMessage("Java工程师");
    }
}
package com.test.project;

import com.test.project.service.TestService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	TestService testService = new TestService();
        System.out.println( "Hello World! "  + testService.testMethod());
    }
}

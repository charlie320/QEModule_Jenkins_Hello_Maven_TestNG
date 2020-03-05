package com.perscholas.jenkins_hello.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.perscholas.jenkins_hello.HelloJenkins;

public class HelloJenkinsTest {
	private String actual = null;
	private String expected = null;
	
	@Test
	public void testHelloJenkins() {
		actual = HelloJenkins.helloJenkins();
		expected = "Hello Jenkins!";
		assertEquals(actual, expected);
	}
	
	@Test
	public void testHelloJenkinsAgain() {
		actual = HelloJenkins.helloJenkinsAgain();
		expected = "Hello Jenkins again";
		assertEquals(actual, expected);
	}
}
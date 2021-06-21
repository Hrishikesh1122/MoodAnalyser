package com.hrishikesh.moodAnalysis;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MoodAnalyserTest {

	String input;
	String expectedResult;
	
	public MoodAnalyserTest(String input , String expectedResult) {
		this.input=input;
		this.expectedResult=expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection myData() {
		return Arrays.asList(new Object[][] {{"I am Sad","Sad"},{"I am Happy","Happy"},{"I am sad","Sad"},
			{"He is happy","Happy"},{"sad sad SAAD","Sad"},{"Sad Happy sad Happy","Sad"}});
	}	
		
	
	MoodAnalyser mood = null;
	
	@Before
	public void setUp() {
		mood = new MoodAnalyser();
	}
	
	@Test
	public void given_Message_ShouldReturnMood() {
		String moodcheck =mood.analyseMood(input) ;
		Assert.assertEquals(expectedResult, moodcheck);	
	}

}

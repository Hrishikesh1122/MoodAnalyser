package com.hrishikesh.moodAnalysis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExceptionTest {
	
MoodAnalyser mood = null;
	
	@Before
	public void setUp() {
		mood = new MoodAnalyser();
	}
	
	@Test
	public void given_Null_ShouldThrowException() {
		try {
			mood.analyseMood(null);
		}catch(MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.exceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void given_EmptyString_ShouldThrowException() {
		try {
			mood.analyseMood("");
		}catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.exceptionType.ENTERED_EMPTY, e.type);
		}
	}

}

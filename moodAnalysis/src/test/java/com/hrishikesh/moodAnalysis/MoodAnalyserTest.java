package com.hrishikesh.moodAnalysis;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

	MoodAnalyser mood = null;
	
	@Before
	public void setUp() {
		mood = new MoodAnalyser();
	}
	
	@Test
	public void given_SadMessage_ShouldReturnSad() {
		String moodcheck =mood.analyseMood("I am Sad") ;
		Assert.assertEquals("Sad", moodcheck);	
	}
	
	@Test
	public void given_HappyMessage_ShouldReturnHappy() {
		String moodcheck =mood.analyseMood("I am Happy") ;
		Assert.assertEquals("Happy", moodcheck);	
	}

}

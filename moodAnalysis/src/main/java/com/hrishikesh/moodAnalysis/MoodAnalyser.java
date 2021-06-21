/************************************************************
 * Purpose : Create a mood analyser program and test it
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 21-06-2021
 *
 ************************************************************/
package com.hrishikesh.moodAnalysis;

public class MoodAnalyser {
	
	/**
	 * If message contains "Sad" it returns sad
	 * else it returns Happy
	 * @param message sent from test method
	 * @return mood
	 */
	public String analyseMood(String message) {
		if(message.contains("Sad"))
			return "Sad";
		else
			return "Happy";
					
	}

}

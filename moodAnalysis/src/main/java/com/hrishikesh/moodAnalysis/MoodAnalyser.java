/************************************************************
 * Purpose : Create a mood analyzer program and test it
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 21-06-2021
 *
 ************************************************************/
package com.hrishikesh.moodAnalysis;

public class MoodAnalyser {

	/**
	 * If message contains "Sad" it returns sad else it returns Happy
	 * If message is empty it throws custom exception "ENTRED_EMPTY"
	 * Else it returns Happy
	 * @param message sent from test method
	 * @return mood
	 * @throws MoodAnalyserException 
	 */
	public String analyseMood(String message) throws MoodAnalyserException {
		try {
			if(message.isEmpty())
				throw  new MoodAnalyserException(MoodAnalyserException.exceptionType.ENTERED_EMPTY,"Please enter correct message");
			if (message.contains("Sad") || message.contains("sad"))
				return "Sad";
			else
				return "Happy";
		} 
		catch (NullPointerException e) {
			throw new MoodAnalyserException(MoodAnalyserException.exceptionType.ENTERED_NULL,"Please enter correct message");
		}

	}

}

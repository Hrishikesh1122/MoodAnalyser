/*******************************************************************
 * Purpose : Created this class to achieve use of custom exceptions
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 21-06-2021
 *
 *******************************************************************/
package com.hrishikesh.moodAnalysis;
public class MoodAnalyserException extends Exception {

	/**
	 *This enum contains custom exception messages
	 */
	enum exceptionType {
		ENTERED_NULL,ENTERED_EMPTY;
	}
	
	exceptionType type;
	
	public MoodAnalyserException(exceptionType type,String message) {
		super(message);
		this.type=type;		
	}
}

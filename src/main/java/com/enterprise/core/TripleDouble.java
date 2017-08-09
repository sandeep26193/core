package com.enterprise.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TripleDouble {

	public int find(int first, int second) {
		// convert to strings
		// loop thru first string chars to find 3 consecutive same char
			// if found 3 consecutive same char then
				// if the same char is repeated two times in second string then
				// return 1
				//end if
			//end if
		//end loop
		//return 0
		
		//this can be done with regular expression too

		Pattern firstPattern = Pattern.compile("(\\d)\\1{2,}");
		Matcher m = firstPattern.matcher(String.valueOf(first));
		
		while (m.find())
		{
		   System.out.println("Duplicate character " + m.group(1));
		   Pattern secondPattern = Pattern.compile("("+m.group(1)+")\\1");
		   Matcher secondMatcher = secondPattern.matcher(String.valueOf(second));
			while(secondMatcher.find()){
				return 1;
			}
		}
		
		
	    return 0;

	}

}

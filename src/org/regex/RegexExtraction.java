package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExtraction {
	
	public static void main(String[] args) {
		String userName="guhan123";
		Pattern pattern=Pattern.compile("^([a-z]+)\\d{3}$");
		Matcher matcher=pattern.matcher(userName);
		String extractedName="";
		if(matcher.find()) {
			System.out.println(matcher.group());
			extractedName=matcher.group(1);
		}
		System.out.println(extractedName);
	}

}

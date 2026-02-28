package org.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexMaskedCardDemo {
	
	public static void main(String args[]) {
		
		String cardNumber="1470-8952-5824-4582";
		String lastFour=cardNumber.substring(15);
//		String[] split = cardNumber.split("\\-");
//		System.out.println(Arrays.toString(split));
		Pattern pattern=Pattern.compile("^(\\d{4})-(\\d{4})-(\\d{4})-(\\d{4})$");
		Matcher matcher=pattern.matcher(cardNumber);
		if(matcher.find()) {
			String replaceAll = matcher.replaceAll("xxxx-xxxx-xxxx-");
			System.out.println(replaceAll+lastFour);
		}
		
	}

}

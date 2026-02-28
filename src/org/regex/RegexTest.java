package org.regex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexTest {
	
	public static void main(String[] args) {
		LocalDate of = LocalDate.of(1999, 01, 22);
		String string = of.toString();
		System.out.println(string);
		Pattern pattern = Pattern.compile("[0-9]{4}-[0-1]{1}[1-9]{1}-[0-3]{1}[0-9]{1}");
		Matcher matcher=pattern.matcher(string);
		boolean b = matcher.find();
		System.out.println(b);
	}

}

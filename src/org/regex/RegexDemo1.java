package org.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
		
		public static void main(String args[]) {
			Scanner scanner=new Scanner(System.in);
			String userName=scanner.next();
			Pattern pattern = Pattern.compile("[a-z]{5}[0-9]{3}");
			Matcher matcher=pattern.matcher(userName);
			System.out.println(matcher.find());
//			while(matcher.find()) {
//				System.out.println(matcher.group() +" "+ matcher.start());
//			}
		}
}

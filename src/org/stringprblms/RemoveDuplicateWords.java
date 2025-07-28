package org.stringprblms;

import java.util.*;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String input = "guhan is a great guy sure guhan is";

        String[] words = input.split(" ");
        Set<String> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!seen.contains(word)) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(word);
                seen.add(word);
            }
        }

        System.out.println(result.toString());
    }
}


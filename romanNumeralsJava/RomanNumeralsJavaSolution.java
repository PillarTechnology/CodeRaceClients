package com.coderace;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
  public static int convert(String romanChar) {
	int output = 0;
        Map<Character, Integer> R = new HashMap<>();
        R.put('M', 1000);
        R.put('D', 500);
        R.put('C', 100);
        R.put('L', 50);
        R.put('X', 10);
        R.put('V', 5);
        R.put('I', 1);
        
        int i = 0;
        while (i < romanChar.length()) {
            if(i == romanChar.length() - 1 || R.get(romanChar.charAt(i)) >= R.get(romanChar.charAt(i + 1))) {
                output += R.get(romanChar.charAt(i));
            } else {
                output += R.get(romanChar.charAt(i + 1)) - R.get(romanChar.charAt(i));
                i++;
            }
            i++;
        }
        return output;
    }

}
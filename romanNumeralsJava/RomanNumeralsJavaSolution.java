package com.coderace;

import java.util.HashMap;

public class RomanNumerals {
  public static int convert(String romanChar) {
	int ouput = 0;
  Map < String, Integer > R = new HashMap<>();
  R.add('M', 1000);
  R.add('D', 500);
  R.add('C', 100);
  R.add('L', 50);
  R.add('X', 10);
  R.add('V', 5);
  R.add('I', 1);

  int i = 0;
  while(i < romanChar.length()) {
    if(i == romanChar.length - 1 || R[romanChar[i]] >= R[romanChar[i + 1]]) {
      output += R[romanChar[i]];
    } else {
      output += R[romanChar[i + 1]] - R[romanChar[i]];
      i++;
    }
    i++;
  }
  return output;
}

}

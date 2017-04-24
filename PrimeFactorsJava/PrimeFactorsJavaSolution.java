package com.coderace;

import java.util.ArrayList;
import java.util.List;

/* Factorize a positive integer number into its
  prime factors.

  Note: 1 has no prime factor.
  */

public class PrimeFactors {
    public List<Integer> generate(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        int currentFactor = 2;

        while (number != 1) {
            if(number % currentFactor == 0) {
                primeFactors.add(currentFactor);
                number /= currentFactor;
                currentFactor = 2;
            } else {
                currentFactor++;
            }
        }
        return primeFactors;
    }
}


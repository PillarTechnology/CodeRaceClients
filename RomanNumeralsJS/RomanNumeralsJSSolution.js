/*
Given a Roman number as a string (eg "XX") determine
its integer value (eg 20).

Examples:

   "I" -> 1 |    "X" -> 10 |
  "II" -> 2 |   "XX" -> 20 |  
 "III" -> 3 |  "XXX" -> 30 | 
  "IV" -> 4 |   "XL" -> 40 |  
   "V" -> 5 |    "L" -> 50 |    
  "VI" -> 6 |   "LX" -> 60 |  
 "VII" -> 7 |  "LXX" -> 70 |  
"VIII" -> 8 | "LXXX" -> 80 | 
  "IX" -> 9 |   "XC" -> 90 |
                "C" -> 100 |


  "XCIX" -> 99   ("XC" -> 90 + "IX" -> 9)
 "XLVII" -> 47   ("XL" -> 40 + "VII" -> 7)
 "LXIV"  -> 64   ("L" -> 50 + "X" -> 10 + "IV" -> 4)

*/


function romanNumerals() {

};

romanNumerals.prototype.convert = function(roman) {
    var output = 0;
    var R = {
        'M': 1000,
        'D': 500,
        'C': 100,
        'L': 50,
        'X': 10,
        'V': 5,
        'I': 1
    };

    var i = 0;
    while (i < roman.length) {
        if (i == (roman.length - 1) || R[roman[i]] >= R[roman[i + 1]]) {
            output += R[roman[i]];
        } else {
            output += R[roman[i + 1]] - R[roman[i]];
            i++;
        }
        i++;
    }

    return output;
};
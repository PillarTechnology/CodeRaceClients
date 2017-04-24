/*
Factorize a positive integer number into its prime factors.

For example:

	 2 -> [2]
	 3 -> [3]
	 4 -> [2,2]
	 6 -> [2,3]
	 9 -> [3,3]
	12 -> [2,2,3]
	15 -> [3,5]
*/

var primeFactors = function(number){
  var primes = [], currentFactor = 2;

	while (number !== 1) {
		if (number % currentFactor === 0) {
			primes.push(currentFactor);
			number /= currentFactor;
			currentFactor = 2;
		} else {
			currentFactor++;
		}
	}
  return primes;
}
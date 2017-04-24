// FizzBuzz Rules:
// 1.) Any number not divisble by 3, 5 or 15 returns the input number
// 2.) Any number divisible by 3 returns "Fizz"
// 3.) Any number divisible by 5 returns "Buzz"
// 4.) Any number divisible by both 3 and 5 returns "FizzBuzz"

function Fizzbuzz(){

  Fizzbuzz.prototype.convert = function(number){
    if(number % 15 === 0) {
      return "FizzBuzz";
    }
    else if (number % 5 === 0) {
      return "Buzz";
    }
    else if (number % 3 === 0) {
      return "Fizz";
    }
    else {
      return number;
    }
  };
}

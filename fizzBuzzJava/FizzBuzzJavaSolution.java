// FizzBuzz Rules:
// 1.) Any number not divisble by 3, 5 or 15 returns the input number
// 2.) Any number divisible by 3 returns "Fizz"
// 3.) Any number divisible by 5 returns "Buzz"
// 4.) Any number divisible by 15 returns "FizzBuzz"

package kataBattle.fizzbuzz;

public class FizzBuzz {

  public static String process(int input) {
    if(input % 15 == 0) {
      return "FizzBuzz";
    } else if (input % 5 == 0) {
      return "Buzz";
    } else if (input % 3 == 0) {
      return "Fizz";
    } else {
      return Integer.toString(input);
    }
  }
}

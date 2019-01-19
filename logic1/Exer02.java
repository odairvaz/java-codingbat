package logic1;

public class Exer02 {
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Return true if the given non-negative number is a multiple of 3 or 5, but not both. 
	 */
	public boolean old35(int n) {
		if (n % 3 == 0 && n % 5 == 0)
			return false;
		return n % 3 == 0 || n % 5 == 0;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
	 * So for example 38 and 39 return true, but 40 returns false. 
	 * 
	 * less20(18) → true
	 * less20(19) → true
	 * less20(20) → false
	 */
	public boolean less20(int n) {
		return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
	 * Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
	 * 
	 * nearTen(12) → true
	 * nearTen(17) → false
	 * nearTen(19) → true 
	 */
	public boolean nearTen(int num) {
		return (num % 10 < 3 || num % 10 >= 8);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 
	 * inclusive, are extra lucky. So if either value is a teen, just return 19.
	 * 
	 * teenSum(3, 4) → 7
	 * teenSum(10, 13) → 19
	 * teenSum(13, 2) → 19
	 */
	public int teenSum(int a, int b) {
		return (a >= 13 && a <= 19 || b >= 13 && b <= 19) ? 19 : a + b;
	}
	
	//-------------------------------------------------------------------------------------------------------------	
	/*
	 * Your cell phone rings. Return true if you should answer it. Normally you answer, 
	 * except in the morning you only answer if it is your mom calling. 
	 * In all cases, if you are asleep, you do not answer.
	 * 
	 * answerCell(false, false, false) → true
	 * answerCell(false, false, true) → false
	 * answerCell(true, false, false) → false
	 */
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if(isAsleep) return false;
		if(isMorning && isMom || !isMorning) return true;
		return false;
	}
	
	//-------------------------------------------------------------------------------------------------------------	
	/*
	 * We are having a party with amounts of tea and candy. Return the int outcome of the party 
	 * encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at 
	 * least 5. However, if either tea or candy is at least double the amount of the other one, 
	 * the party is great (2). However, in all cases, if either tea or candy is less than 5, 
	 * the party is always bad (0).
	 * 
	 * teaParty(6, 8) → 1
	 * teaParty(3, 8) → 0
	 * teaParty(20, 6) → 2
	 */
	public static int teaParty(int tea, int candy) {
		if(tea < 5 || candy < 5) 
			return 0;
		if(tea >= candy + candy || candy >= tea + tea) return 2;
		return 1;
	}
	
	//-------------------------------------------------------------------------------------------------------------	
	/*
	 * Given a string str, if the string starts with "f" return "Fizz". 
	 * If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, 
	 * return "FizzBuzz". In all other cases, return the string unchanged. 
	 * 
	 * fizzString("fig") → "Fizz"
	 * fizzString("dib") → "Buzz"
	 * fizzString("fib") → "FizzBuzz"
	 */
	public static String fizzString(String str) {
		boolean f = str.startsWith("f");
		boolean b = str.endsWith("b");

		if (f && b)
			return "FizzBuzz";
		if (f)
			return "Fizz";
		if (b)
			return "Buzz";
		return str;
	}

	//-------------------------------------------------------------------------------------------------------------	
	/*
	 * Given an int n, return the string form of the number followed by "!". 
	 * So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" 
	 * instead of the number, and if the number is divisible by 5 use "Buzz", 
	 * and if divisible by both 3 and 5, use "FizzBuzz". 
	 * 
	 * fizzString2(1) → "1!"
	 * fizzString2(2) → "2!"
	 * fizzString2(3) → "Fizz!"
	 */
	public static String fizzString2(int n) {
		if(n % 5 == 0 || n % 3 == 0 )
			return "FizzBuzz!";
		if(n % 3 == 0 )
			return "Fizz";
		if(n % 5 == 0 )
			return "Buzz!";
		return n + "!";
	}

	
	public static void main(String[] args) {
		System.out.println(Exer02.fizzString("fib"));
	}


	
}

package logic1;

public class Exer03 {
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
	 * 
	 * twoAsOne(1, 2, 3) â†’ true
	 * twoAsOne(3, 1, 2) â†’ true
	 * twoAsOne(3, 2, 2) â†’ false
	 */
	public static boolean twoAsOne(int a, int b, int c) {
		return (a+b == c) || (b+c == a) || (a+c == b);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given three ints, a b c, return true if b is greater than a, and c is greater than b. 
	 * However, with the exception that if "bOk" is true, b does not need to be greater than a.
	 * 
	 * inOrder(1, 2, 4, false) â†’ true
	 * inOrder(1, 2, 1, false) â†’ false
	 * inOrder(1, 1, 2, true) â†’ true
	 */
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if(bOk)
			return c > b;
		return (b > a) && (c > b);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, 
	 * or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, 
	 * equality is allowed, such as 5 5 7 or 5 5 5.
	 * 
	 * inOrderEqual(2, 5, 11, false) â†’ true
	 * inOrderEqual(5, 7, 6, false) â†’ false
	 * inOrderEqual(5, 5, 7, true) â†’ true
	 */
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if(equalOk)
			return (a <= b) && (b <= c);
		return (a < b) && (b < c);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
	 * The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
	 * 
	 * lastDigit(23, 19, 13) â†’ true
	 * lastDigit(23, 19, 12) â†’ false
	 * lastDigit(23, 19, 3) â†’ true
	 */
	public boolean lastDigit(int a, int b, int c) {
		int lastA = a % 10;
		int lastB = b % 10;
		int lastC = c % 10;
		return (lastA == lastB) || (lastA == lastC) || (lastC == lastB);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
	 * 
	 * lessBy10(1, 7, 11) â†’ true
	 * lessBy10(1, 7, 10) â†’ false
	 * lessBy10(11, 1, 7) â†’ true
	 */
	public boolean lessBy10(int a, int b, int c) {
		int aMinusB = Math.abs(a - b);
		int aMinusC = Math.abs(a - c);
		int bMinusC = Math.abs(c - b);
		return (aMinusB >= 10) || (aMinusC >= 10) || (bMinusC >= 10);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, 
	 * if the two dice show the same value, increment one die to the next value, 
	 * wrapping around to 1 if its value was 6.
	 * 
	 * withoutDoubles(2, 3, true) → 5
	 * withoutDoubles(3, 3, true) → 7
	 * withoutDoubles(3, 3, false) → 6
	 */
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if(noDoubles && die1 == die2) {
			die1++;
	        if(die1 == 7)
	            die1 = 1;
		}
		return die1 + die2;
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given two int values, return whichever value is larger. However if the two values have the same remainder 
	 * when divided by 5, then the return the smaller value. However, in all cases, if the two values are the 
	 * same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
	 * 
	 * maxMod5(2, 3) → 3
	 * maxMod5(6, 2) → 6
	 * maxMod5(3, 2) → 3
	 */
	public int maxMod5(int a, int b) {
		if (a == b)
			return 0;
		if (a % 5 == b % 5)
			return a < b ? a : b;
		return a > b ? a : b;
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. 
	 * If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. 
	 * Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
	 * 
	 * redTicket(2, 2, 2) → 10
	 * redTicket(2, 2, 1) → 0
	 * redTicket(0, 0, 0) → 5
	 */
	public int redTicket(int a, int b, int c) {
		if (a == b && b == 2 && c == 2)
			return 10;
		if (a == b && a == c)
			return 5;
		if (b != a && a != c)
			return 1;
		return 0;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, 
	 * the result is 0. If all of the numbers are the same, the result is 20. 
	 * If two of the numbers are the same, the result is 10.
	 * 
	 * greenTicket(1, 2, 3) → 0
	 * greenTicket(2, 2, 2) → 20
	 * greenTicket(1, 1, 2) → 10
	 */
	public int greenTicket(int a, int b, int c) {
		if(a == b && b == c) 
			return 20;
		if(a == b || a == c || b == c)
			return 10;
		return 0;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. 
	 * Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. 
	 * Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
	 * 
	 * blueTicket(9, 1, 0) → 10
	 * blueTicket(9, 2, 0) → 0
	 * blueTicket(6, 1, 4) → 10
	 */
	public int blueTicket(int a, int b, int c, String bd) {
		int ab = a + b;
		int bc = b + c;
		int ac = a + c;		
		
		if( ab == 10 || ac == 10 || bc == 10) return 10;
		if( ab - bc == 10 || ab - ac == 10 ) return 5;
		return 0;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, 
	 * such as the 2 in 12 and 23. 
	 * (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
	 * 
	 * shareDigit(12, 23) → true
	 * shareDigit(12, 43) → false
	 * shareDigit(12, 44) → false
	 */
	public boolean shareDigit(int a, int b) {
		int rightDigitA = a % 10;
		int leftDigitA = a / 10;
		int rightDigitB = b % 10;
		int leftDigitB = b / 10;
		
		return (rightDigitA == rightDigitB) || 
				(rightDigitA == leftDigitB) || 
				(leftDigitA == rightDigitB) || 
				(leftDigitA == leftDigitB);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. 
	 * If the sum has more digits than a, just return a without b. 
	 * (Note: one way to compute the number of digits of a non-negative int n is to convert it to a 
	 * string with String.valueOf(n) and then check the length of the string.)
	 * 
	 * sumLimit(2, 3) → 5
	 * sumLimit(8, 3) → 8
	 * sumLimit(8, 1) → 9
	 */
	public int sumLimit(int a, int b) {
		  
	}




	
	public static void main(String[] args) {
		System.out.println(Exer03.twoAsOne(3, 2, 2));
		
	}


}

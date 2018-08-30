package warmup1;

public class Exer02 {
	
	/*
	 	Given a string, return true if the string starts with "hi" and false otherwise.

		startHi("hi there") → true
		startHi("hi") → true
		startHi("hello hi") → false
	 */
	
	public boolean startHi(String str) {
		if(str.length() < 2)
			return false;
		
		return str.substring(0, 2).equals("hi");
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/* 	
		Given 2 int values, return true if either of them is in the range 10..20 inclusive.
		
		in1020(12, 99) → true
		in1020(21, 12) → true
		in1020(8, 99) → false
	 */
	public boolean in1020(int a, int b) {
		return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
	 We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
	 Given 3 int values, return true if 1 or more of them are teen.

	 hasTeen(13, 20, 10) → true
	 hasTeen(20, 19, 10) → true
	 hasTeen(20, 10, 13) → true
	 */
	
	public boolean hasTeen(int a, int b, int c) {
		return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
	 We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
	 Given 2 int values, return true if one or the other is teen, but not both.

	loneTeen(13, 99) → true
	loneTeen(21, 19) → true
	loneTeen(13, 13) → false
	 */
	
	public boolean loneTeen(int a, int b) {
		// Store teen-ness in boolean local vars first. Boolean local
		// vars like this are a little rare, but here they work great.
		boolean aTeen = (a >= 13 && a <= 19);
		boolean bTeen = (b >= 13 && b <= 19);

		return (aTeen && !bTeen) || (!aTeen && bTeen);
		// Translation: one or the other, but not both.
		// Alternately could use the Java xor operator, but it's obscure.
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
	   Given a string, if the string "del" appears starting at index 1, 
	   return a string where that "del" has been deleted. 
	   Otherwise, return the string unchanged.

		delDel("adelbc") → "abc"
		delDel("adelHello") → "aHello"
		delDel("adedbc") → "adedbc"
	 */
	
	public String delDel2(String str) {
		if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
			// First char + rest of string starting at 4
			return str.substring(0, 1) + str.substring(4);
		}
		// Otherwise return the original string.
		return str;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
	   Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

		mixStart("mix snacks") → true
		mixStart("pix snacks") → true
		mixStart("piz snacks") → false
	 */
	
	public boolean mixStart(String str) {
		return (str.length() > 3 && str.substring(1, 3).equals("ix")) ;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
		Given a string, return a string made of the first 2 chars (if present), 
		however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
		
		startOz("ozymandias") → "oz"
		startOz("bzoo") → "z"
		startOz("oxx") → "o"
	 */
	
	public String startOz(String str) {
		String result = "";
		if (str.length() >= 1 && str.charAt(0) == 'o') {
			result += str.charAt(0);
		}
		if (str.length() >= 2 && str.charAt(1) == 'z') {
			result += str.charAt(1);
		}
		
		return result;
	}

	//-------------------------------------------------------------------------------------------------------------
	
	/*
	  Given three int values, a b c, return the largest.
	  
	  	intMax(1, 2, 3) → 3
		intMax(1, 3, 2) → 3
		intMax(3, 2, 1) → 3
	 */
	
	public static int intMax(int a, int b, int c) {
		int maxAB = Integer.max(a, b);
		int maxC = Integer.max(maxAB, c);
		
		return maxC;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
	   Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
	   Note that Math.abs(n) returns the absolute value of a number.
	   
	   close10(8, 13) → 8
	   close10(13, 8) → 8
	   close10(13, 7) → 0
	 */
	
	public static int close10(int a, int b) {
		int first = Math.abs(10 - a);
		int second = Math.abs(10 - b);
		return (first == second) ? 0 : Math.min(a, b);		
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
		Given 2 int values, return true if they are both in the range 30..40 inclusive,
		or they are both in the range 40..50 inclusive.
				
		in3050(30, 31) → true
		in3050(30, 41) → false
		in3050(40, 50) → true
	 */
	
	public static boolean in3050(int a, int b) {
		return (a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
	  Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, 
	  or return 0 if neither is in that range.


		max1020(11, 19) → 19
		max1020(19, 11) → 19
		max1020(11, 9) → 11
	 */
	
	public int max1020(int a, int b) {
		// First make it so the bigger value is in a
		  if (b > a) {
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  
		  // Knowing a is bigger, just check a first
		  if (a >= 10 && a <= 20) return a;
		  if (b >= 10 && b <= 20) return b;
		  return 0;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
		Return true if the given string contains between 1 and 3 'e' chars.

		stringE("Hello") → true
		stringE("Heelle") → true
		stringE("Heelele") → false
	*/
	
	public static boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		return (count >= 1 && count <= 3);
	}
	//-------------------------------------------------------------------------------------------------------------
	
	/*
	 Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. 
	 Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


	 lastDigit(7, 17) → true
	 lastDigit(6, 17) → false
	 lastDigit(3, 113) → true
	 */
	
	public static boolean lastDigit(int a, int b) {
		return(a % 10 == b % 10);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
	 Given a string, return a new string where the last 3 chars are now in upper case. 
	 If the string has less than 3 chars, uppercase whatever is there. 
	 Note that str.toUpperCase() returns the uppercase version of a string.


	endUp("Hello") → "HeLLO"
	endUp("hi there") → "hi thERE"
	endUp("hi") → "HI"
	 */
	
	public static String endUp(String str) {
		if (str.length() < 3) {
			return str.toUpperCase();
		}
		return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
	}
	
	//-------------------------------------------------------------------------------------------------------------
	
	/*
	 
		Given a non-empty string and an int N, return the string made starting with char 0, and 
		then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
		
		everyNth("Miracle", 2) → "Mrce"
		everyNth("abcdefg", 2) → "aceg"
		everyNth("abcdefg", 3) → "adg"
	 */
	public static String everyNth(String str, int n) {
		String result = "";
		for (int i = 0; i < str.length(); i+=n) 
			result += str.charAt(i);
		return result;
	}
	
}

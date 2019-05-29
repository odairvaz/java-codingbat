package string2;

public class Exer01 {

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a string, return a string where for every char in the original, there are two chars.
	 * 
	 * doubleChar("The") → "TThhee"
	 * doubleChar("AAbb") → "AAAAbbbb"
	 * doubleChar("Hi-There") → "HHii--TThheerree"
	 */
	public static String doubleChar(String str) {
		StringBuilder stb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			stb.append(str.charAt(i));
			stb.append(str.charAt(i));
		}			
		return stb.toString();
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Return the number of times that the string "hi" appears anywhere in the given string.
	 * 
	 * countHi("abc hi ho") → 1
	 * countHi("ABChi hi") → 2
	 * countHi("hihi") → 2
	 */
	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) 
			if (str.substring(i, i+2).equals("hi")) 
				count++;
		return count;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
	 * 
	 * catDog("catdog") → true
	 * catDog("catcat") → false
	 * catDog("1cat1cadodog") → true
	 */
	public static boolean catDog(String str) {
		int diff = 0;
		for(int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i+3).equals("cat")) 
				diff++;
			else if (str.substring(i, i+3).equals("dog")) 
				diff--;
		}
		return (diff == 0);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Return the number of times that the string "code" appears anywhere in the given string, 
	 * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
	 * 
	 * countCode("aaacodebbb") → 1
	 * countCode("codexxcode") → 2
	 * countCode("cozexxcope") → 2
	 */
	public static int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) 
			if(str.substring(i, i+2).equals("co") && str.charAt(i+3) == 'e')
				count++;
		return count;
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given two strings, return true if either of the strings appears at the very end of the other string, 
	 * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
	 * Note: str.toLowerCase() returns the lowercase version of a string.
	 * 
	 * endOther("Hiabc", "abc") → true
	 * endOther("AbC", "HiaBc") → true
	 * endOther("abc", "abXabc") → true
	 */
	public static boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.length() > b.length())
			if(a.endsWith(b)) return true;
		if(b.endsWith(a)) return true;
		return false;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Return true if the given string contains an appearance of "xyz" where the xyz is 
	 * not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
	 * 
	 * xyzThere("abcxyz") → true
	 * xyzThere("abc.xyz") → false
	 * xyzThere("xyz.abc") → true
	 */
	public static boolean xyzThere(String str) {
		if(str.startsWith("xyz")) return true;
		for (int i = 1; i < str.length() - 2; i++) 
			if(str.substring(i, i+3).equals("xyz") && str.charAt(i-1) != '.') return true;
		
		return false;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
	 * 
	 * bobThere("abcbob") → true
	 * bobThere("b9b") → true
	 * bobThere("bac") → false
	 */
	public static boolean bobThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) 
			if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
		return false;
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' 
	 * char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. 
	 * One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
	 * 
	 * xyBalance("aaxbby") → true
	 * xyBalance("aaxbb") → false
	 * xyBalance("yaaxbb") → false
	 */
	public static boolean xyBalance(String str) {
		int lastX = str.lastIndexOf('x');
		int lastY = str.lastIndexOf('y');
		return ( lastX <= lastY);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given two strings, a and b, create a bigger string made of the first char of a, the first char 
	 * of b, the second char of a, the second char of b, and so on. 
	 * Any leftover chars go at the end of the result.
	 * 
	 * mixString("abc", "xyz") → "axbycz"
	 * mixString("Hi", "There") → "HTihere"
	 * mixString("xxxx", "There") → "xTxhxexre"
	 */
	public String mixString(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		int max = Math.max(aLen, bLen);
		String word = "";

		for (int i = 0; i < max; i++) {
			if (i <= aLen - 1)
				word += a.substring(i, i + 1);
			if (i <= bLen - 1)
				word += b.substring(i, i + 1);
		}
		return word;
	}


	
	
	
	public static void main(String[] args) {
		System.out.println(xyBalance("yaaxbb"));
		if(true) {
			int a = 3;
		}
	}
	
	
	
}

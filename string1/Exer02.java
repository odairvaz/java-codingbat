package string1;

public class Exer02 {
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a string, return a string length 2 made of its first 2 chars. 
	 * If the string length is less than 2, use '@' for the missing chars.
	 * 
	 * atFirst("hello") → "he"
	 * atFirst("hi") → "hi"
	 * atFirst("h") → "h@"
	 */

	public static String atFirst(String str) {
		if(str.equals("")) return "@@";
		return str.length() < 2 ? str + "@" : str.substring(0, 2);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given 2 strings, a and b, return a new string made of the first char of a and the last 
	 * char of b, so "yo" and "java" yields "ya". 
	 * If either string is length 0, use '@' for its missing char.
	 * 
	 * lastChars("last", "chars") → "ls"
	 * lastChars("yo", "java") → "ya"
	 * lastChars("hi", "") → "h@"
	 */
	
	public static String lastChars(String a, String b) {
		if(a.equals("") && b.equals("")) return "@@";
		if(a.equals("") && !b.equals("")) return "@" + b.charAt(b.length() - 1);
		if(!a.equals("") && b.equals("")) return a.charAt(0) + "@";
		return a.substring(0, 1) + b.charAt(b.length() - 1);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given two strings, append them together (known as "concatenation") and return the result. 
	 * However, if the concatenation creates a double-char, then omit one of the chars, 
	 * so "abc" and "cat" yields "abcat".
	 * 
	 * conCat("abc", "cat") → "abcat"
	 * conCat("dog", "cat") → "dogcat"
	 * conCat("abc", "") → "abc"
	 */
	
	public static String conCat(String a, String b) {
		if(a.length() > 0 && b.length() > 0)
			if(a.charAt(a.length() - 1) == b.charAt(0)) return a + b.substring(1);
		
		return a + b;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a string, if the string begins with "red" or "blue" return that color string, 
	 * otherwise return the empty string.
	 * 
	 * seeColor("redxx") → "red"
	 * seeColor("xxred") → ""
	 * seeColor("blueTimes") → "blue"
	 */
	
	public static String seeColor(String str) {
		if(str.length() > 2 && str.substring(0, 3).equals("red")) return "red";
		
		if(str.length() > 3 && str.substring(0, 4).equals("blue")) return "blue";
		return "";
	} 
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a string, return true if the first 2 chars in the string also 
	 * appear at the end of the string, such as with "edited".
	 * 
	 * frontAgain("edited") → true
	 * frontAgain("edit") → false
	 * frontAgain("ed") → true
	 */
	
	public static boolean frontAgain(String str) {
		if(str.length() < 2) return false;
		
		return str.substring(0, 2).equals(str.substring(str.length() - 2));
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given two strings, append them together (known as "concatenation") and return the result.
	 *  However, if the strings are different lengths, omit chars from the longer 
	 *  string so it is the same length as the shorter string. 
	 *  So "Hello" and "Hi" yield "loHi". The strings may be any length.
	 *  
	 *  minCat("Hello", "Hi") → "loHi"
	 *  minCat("Hello", "java") → "ellojava"
	 *  minCat("java", "Hello") → "javaello"
	 */
	
	public static String minCat(String a, String b) {
		return a.length() > b.length() ? a.substring(a.length() - b.length()) + b :a + b.substring( b.length() - a.length());
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a string, return a new string made of 3 copies of the first 2 chars of 
	 * the original string. The string may be any length. 
	 * If there are fewer than 2 chars, use whatever is there.
	 * 
	 * extraFront("Hello") → "HeHeHe"
	 * extraFront("ab") → "ababab"
	 * extraFront("H") → "HHH"
	 */

	public static String extraFront(String str) {
		if(str.equals("")) return "";
		if(str.length() == 1 || str.length() == 2) return str+str+str;
		String val = str.substring(0, 2);
		return val+val+val;
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a string, if a length 2 substring appears at both its beginning and end, 
	 * return a string without the substring at the beginning, so "HelloHe" yields "lloHe". 
	 * The substring may overlap with itself, so "Hi" yields "". 
	 * Otherwise, return the original string unchanged.
	 * 
	 * without2("HelloHe") → "lloHe"
	 * without2("HelloHi") → "HelloHi"
	 * without2("Hi") → ""
	 */

	public static String without2(String str) {
		if(str.length() == 2 || str.length() == 0) return "";
		if(str.length() == 1) return str;
		
		return str.substring(0, 2).equals(str.substring(str.length() - 2)) ? str.substring(2) : str;
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a string, return a version without the first 2 chars. 
	 * Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
	 * The string may be any length. Harder than it looks.
	 * 
	 * deFront("Hello") → "llo"
	 * deFront("java") → "va"
	 * deFront("away") → "aay"
	 */

	public String deFront(String str) {
		if (str.length() == 1 && str.charAt(0) != 'a')
			return "";

		if (str.length() >= 2) {
			if (str.charAt(0) != 'a' && str.charAt(1) != 'b') {
				return str.substring(2);
			} else if (str.charAt(0) != 'a') {
				return str.substring(1);
			} else if (str.charAt(1) != 'b') {
				return "a" + str.substring(2);
			}
		}
		return str;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a string and a second "word" string, we'll say that the word matches the 
	 * string if it appears at the front of the string, except its first char does not 
	 * need to match exactly. On a match, return the front of the string, or otherwise 
	 * return the empty string. So, so with the string "hippo" the word "hi" returns "hi" 
	 * and "xip" returns "hip". The word will be at least length 1.
	 * 
	 * startWord("hippo", "hi") → "hi"
	 * startWord("hippo", "xip") → "hip"
	 * startWord("hippo", "i") → "h"
	 */
	
	public String startWord(String str, String word) {
		if (str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1)))
			return str.substring(0, word.length());

		return "";
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a string, if the first or last chars are 'x', return the string 
	 * without those 'x' chars, and otherwise return the string unchanged.
	 * 
	 * withoutX("xHix") → "Hi"
	 * withoutX("xHi") → "Hi"
	 * withoutX("Hxix") → "Hxi"
	 */
	
	public static String withoutX(String str) {
		if (str.length() > 0 && str.charAt(0) == 'x') {
			str = str.substring(1);
		}

		if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
			str = str.substring(0, str.length() - 1);
		}

		return str;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given a string, if one or both of the first 2 chars is 'x', return the string 
	 * without those 'x' chars, and otherwise return the string unchanged. 
	 * This is a little harder than it looks.
	 * 
	 * withoutX2("xHi") → "Hi"
	 * withoutX2("Hxi") → "Hi"
	 * withoutX2("Hi") → "Hi"
	 */
	
	public static String withoutX2(String str) {
		if(str.length() >= 2) {
			if(str.substring(0, 2).equals("xx")) return str.substring(2);
			if(str.charAt(1) == 'x') return str.charAt(0) + str.substring(2);
		}
		if(str.length() >= 1 && str.charAt(0) == 'x') return str.substring(1);
		return str;
	}

	public static void main(String[] args) {
		System.out.println(withoutX2("Hi"));
	}
}

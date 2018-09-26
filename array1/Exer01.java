package array1;

import java.util.Arrays;

public class Exer01 {
	/*
	 * Given an array of ints, return true if 6 appears as either the first or last 
	 * element in the array. The array will be length 1 or more.
	 * 
	 * firstLast6([1, 2, 6]) → true
	 * firstLast6([6, 1, 2, 3]) → true
	 * firstLast6([13, 6, 1, 2, 3]) → false
	 */
	
	public static boolean firstLast6(int[] nums) {
		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints, return true if the array is length 1 or more, 
	 * and the first element and the last element are equal.
	 * 
	 * sameFirstLast([1, 2, 3]) → false
	 * sameFirstLast([1, 2, 3, 1]) → true
	 * sameFirstLast([1, 2, 1]) → true
	 */
	
	public static boolean sameFirstLast(int[] nums) {
		return nums.length >= 1 && nums[0] == nums[nums.length - 1];
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
	 * makePi() → [3, 1, 4]
	 * 
	 */
	
	public static int[] makePi() {
		int[] arrayPi = new int[3];
		arrayPi[0] = 3;
		arrayPi[1] = 1;
		arrayPi[2] = 4;
		return arrayPi;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given 2 arrays of ints, a and b, return true if they have the same first 
	 * element or they have the same last element. Both arrays will be length 1 or more.
	 * 
	 * commonEnd([1, 2, 3], [7, 3]) → true
	 * commonEnd([1, 2, 3], [7, 3, 2]) → false
	 * commonEnd([1, 2, 3], [1, 3]) → true
	 */
	public static boolean commonEnd(int[] a, int[] b) {
		return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints length 3, return the sum of all the elements.
	 * 
	 * sum3([1, 2, 3]) → 6
	 * sum3([5, 11, 2]) → 18
	 * sum3([7, 0, 0]) → 7
	 */
	public static int sum3(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints length 3, return an array with 
	 * the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
	 * 
	 * rotateLeft3([1, 2, 3]) → [2, 3, 1]
	 * rotateLeft3([5, 11, 9]) → [11, 9, 5]
	 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
	 */
	
	public static int[] rotateLeft3(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = temp;
		}			
		return nums;		
	}		
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints length 3, return a new array with the
	 * elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
	 * 
	 * reverse3([1, 2, 3]) → [3, 2, 1]
	 * reverse3([5, 11, 9]) → [9, 11, 5]
	 * reverse3([7, 0, 0]) → [0, 0, 7]
	 */
	public static int[] reverse3(int[] nums) {
		int[] newArr = new int[nums.length];
		for (int i = nums.length - 1; i >= 0; i--) 
			newArr[nums.length - 1 - i] = nums[i];
		return newArr;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints length 3, figure out which is larger, 
	 * the first or last element in the array, and set all the other 
	 * elements to be that value. Return the changed array.
	 * 
	 * maxEnd3([1, 2, 3]) → [3, 3, 3]
	 * maxEnd3([11, 5, 9]) → [11, 11, 11]
	 * maxEnd3([2, 11, 3]) → [3, 3, 3]
	 */
	public static int[] maxEnd3(int[] nums) {
		int larger = Math.max(nums[0], nums[nums.length - 1]);
		for (int i = 0; i < nums.length; i++) 
			nums[i] = larger;		
		return nums;
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints, return the sum of the first 2 elements in the array. 
	 * If the array length is less than 2, just sum up the elements that exist, 
	 * returning 0 if the array is length 0.
	 * 
	 * sum2([1, 2, 3]) → 3
	 * sum2([1, 1]) → 2
	 * sum2([1, 1, 1, 1]) → 2
	 */
	public static int sum2(int[] nums) {
		if(nums.length == 0) return 0;
		if(nums.length == 1) return nums[0];				
		return nums[0] + nums[1];
	}
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given 2 int arrays, a and b, each length 3, return a new 
	 * array length 2 containing their middle elements.
	 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
	 * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
	 * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
	 */
	public static int[] middleWay(int[] a, int[] b) {
		int[]c = { a[1], b[1] };
		return c;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints, return a new array length 2 containing the first and last
	 * elements from the original array. The original array will be length 1 or more.
	 * 
	 * makeEnds([1, 2, 3]) → [1, 3]
	 * makeEnds([1, 2, 3, 4]) → [1, 4]
	 * makeEnds([7, 4, 6, 2]) → [7, 2]
	 */
	public static int[] makeEnds(int[] nums) {
		int[] c = {nums[0], nums[nums.length - 1]};
		return c;
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an int array length 2, return true if it contains a 2 or a 3.
	 * 
	 * has23([2, 5]) → true
	 * has23([4, 3]) → true
	 * has23([4, 5]) → false
	 */
	public static boolean has23(int[] nums) {
		return (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3); 
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an int array length 2, return true if it does not contain a 2 or 3.
	 * 
	 * no23([4, 5]) → true
	 * no23([4, 2]) → false
	 * no23([3, 5]) → false
	 */
	public static boolean no23(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 || nums[i] == 3)
				return false;
		}
		return true;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an int array, return a new array with double the length where its 
	 * last element is the same as the original array, and all the other elements are 0. 
	 * The original array will be length 1 or more. 
	 * Note: by default, a new int array contains all 0's.
	 * 
	 * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
	 * makeLast([1, 2]) → [0, 0, 0, 2]
	 * makeLast([3]) → [0, 3]
	 */
	
	public static int[] makeLast(int[] nums) {
		int[] result = new int[nums.length * 2];
		result[result.length - 1] = nums[nums.length - 1];
		return result;
	}	
}

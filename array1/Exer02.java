package array1;

import java.util.Arrays;

public class Exer02 {
	
	/*
	 * Given an int array, return true if the array contains 2 twice, or 3 twice. 
	 * The array will be length 0, 1, or 2.
	 * 
	 * double23([2, 2]) → true
	 * double23([3, 3]) → true
	 * double23([2, 3]) → false
	 */
	public static boolean double23(int[] nums) {
		if (nums.length < 2)
			return false;
		return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an int array length 3, if there is a 2 in the array immediately 
	 * followed by a 3, set the 3 element to 0. Return the changed array.
	 * 
	 * fix23([1, 2, 3]) → [1, 2, 0]
	 * fix23([2, 3, 5]) → [2, 0, 5]
	 * fix23([1, 2, 1]) → [1, 2, 1]
	 */
	public static int[] fix23(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++)
			if(nums[i] == 2 && nums[i+1] == 3) nums[i+1] = 0;
		return nums;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Start with 2 int arrays, a and b, of any length. 
	 * Return how many of the arrays have 1 as their first element.
	 * 
	 * start1([1, 2, 3], [1, 3]) → 2
	 * start1([7, 2, 3], [1]) → 1
	 * start1([1, 2], []) → 1
	 */
	public static int start1(int[] a, int[] b) {
		int sum = 0;
		if(a.length >= 1 && a[0] == 1)  
			sum += 1; 
		
		if(b.length >= 1 && b[0] == 1)  
			sum += 1; 
		return  sum;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values 
	 * in each array. Return the array which has the largest sum. In event of a tie, return a.
	 * 
	 * biggerTwo([1, 2], [3, 4]) → [3, 4]
	 * biggerTwo([3, 4], [1, 2]) → [3, 4]
	 * biggerTwo([1, 1], [1, 2]) → [1, 2]
	 */
	public static int[] biggerTwo(int[] a, int[] b) {
		return (a[0] + a[1]) >= (b[0] + b[1]) ? a : b;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints of even length, return a new array length 2 containing the 
	 * middle two elements from the original array. The original array will be length 2 or more.
	 * 
	 * makeMiddle([1, 2, 3, 4]) → [2, 3]
	 * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
	 * makeMiddle([1, 2]) → [1, 2]
	 */
	public static int[] makeMiddle(int[] nums) {
		int[] result = { nums[nums.length/2-1], nums[nums.length/2] };
		return result;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given 2 int arrays, each length 2, 
	 * return a new array length 4 containing all their elements.
	 * 
	 * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
	 * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
	 * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
	 */	
	public static int[] plusTwo(int[] a, int[] b) {
		int[] result = {a[0], a[1], b[0], b[1]};
		return result;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints, swap the first and last elements in the array. 
	 * Return the modified array. The array length will be at least 1.
	 * 
	 * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
	 * swapEnds([1, 2, 3]) → [3, 2, 1]
	 * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
	 */ 
	public static int[] swapEnds(int[] nums) {
		if(nums.length < 2) return nums;
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		return nums;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints of odd length, return a new array length 3 containing 
	 * the elements from the middle of the array. The array length will be at least 3.
	 * 
	 * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
	 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
	 * midThree([1, 2, 3]) → [1, 2, 3]
	 */
	public static int[] midThree(int[] nums) {
		if(nums.length <= 3) return nums;
		int mid = nums.length / 2;
	    int[] result = { nums[mid - 1], nums[mid], nums[mid + 1] };
		return result;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an array of ints of odd length, look at the first, last, 
	 * and middle values in the array and return the largest. 
	 * The array length will be a least 1.
	 * 
	 * maxTriple([1, 2, 3]) → 3
	 * maxTriple([1, 5, 3]) → 5
	 * maxTriple([5, 2, 3]) → 5
	 */
	
	public static int maxTriple(int[] nums) {
		if (nums.length < 2)
			return nums[0];
		int max = Math.max(nums[0], nums[nums.length / 2]);
		max = Math.max(max, nums[nums.length - 1]);
		return max;
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given an int array of any length, return a new array of its first 2 elements. 
	 * If the array is smaller than length 2, use whatever elements are present.
	 * 
	 * frontPiece([1, 2, 3]) → [1, 2]
	 * frontPiece([1, 2]) → [1, 2]
	 * frontPiece([1]) → [1]
	 */
	
	public static int[] frontPiece(int[] nums) {
		if(nums.length <= 2)
			return nums;
		int[] result = {nums[0], nums[1]};
		return result;
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
	 * Return true if the given array contains an unlucky 1 in the first 
	 * 2 or last 2 positions in the array.
	 * 
	 * unlucky1([1, 3, 4, 5]) → true
	 * unlucky1([2, 1, 3, 4, 5]) → true
	 * unlucky1([1, 1, 1]) → false
	 */
	public static boolean unlucky1(int[] nums) {
		if(nums.length < 2) return false;
		return (nums[0] == 1 && nums[1] == 3) ||
				(nums[1] == 1 && nums[2] == 3) ||
				(nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
	}
	
	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
	 * the elements from a followed by the elements from b. The arrays may be any length, 
	 * including 0, but there will be 2 or more elements available between the 2 arrays.
	 * 
	 * make2([4, 5], [1, 2, 3]) → [4, 5]
	 * make2([4], [1, 2, 3]) → [4, 1]
	 * make2([], [1, 2]) → [1, 2]
	 */
	
	public static int[] make2(int[] a, int[] b) {		
		int[] result = new int[2];
		if(a.length >= 2) {
			result[0] = a[0];
			result[1] = a[1];
			return result;
		} 		
		if(a.length == 1) {
			result[0] = a[0];
			result[1] = b[0];
			return result;
		}
		result[0] = b[0];
		result[1] = b[1];
		return result;
	}

	//-------------------------------------------------------------------------------------------------------------
	/*
	 * Given 2 int arrays, a and b, of any length, return a new array with the first 
	 * element of each array. If either array is length 0, ignore that array.
	 * 
	 * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
	 * front11([1], [2]) → [1, 2]
	 * front11([1, 7], []) → [1]
	 */
	
	public static int[] front11(int[] a, int[] b) {
		int[] result;
		if(a.length == 0 && b.length == 0) {
			result = new int[0];
			return result;
		}
		
		if(a.length == 0 ) {
			result = new int[1];
			result[0] = b[0];
			return result;
		}
		
		if(b.length == 0 ) {
			result = new int[1];
			result[0] = a[0];
			return result;
		}
		result = new int[2];
		result[0] = a[0];
		result[1] = b[0];
		return result;
	}




	public static void main(String[] args) {
		int[] a = {1,7};
		int[] b = {};
		System.out.println(Arrays.toString(front11(a,b)));
		//System.out.println(unlucky1(a));
	}

}

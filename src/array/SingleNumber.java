package array;

/**
 * 136. Single Number
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 * 		Input: [2,2,1]
 * 		Output: 1
 *
 * Example 2:
 * 		Input: [4,1,2,1,2]
 * 		Output: 4
 * @author xudeming
 * @date 2019/3/26
 */
public class SingleNumber {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{2,2,1})==1);
	}


	/**
	 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
	 */
	public static int singleNumber(int[] nums) {
		int res = nums[0];
		for (int i = 1; i < nums.length; i++) {
			res ^= nums[i];
		}
		return res;
	}

}

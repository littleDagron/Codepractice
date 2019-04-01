public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        int i = 0, len = nums.length-1;
        while(i<len)
        {
            int mid = i + (len - i)/2;
            if(nums[mid] > nums[len])
                i = mid + 1;
            else len = mid;
        }
        return nums[i];
    }
}
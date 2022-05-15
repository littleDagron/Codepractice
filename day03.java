public class day03 {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int low = 0, high = nums.length-1, n = nums.length;
        while(low < high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid] < target)
            {
                low = mid + 1;
            }
            else high = mid;
        }
        return (high < n && nums[high] == target)? high : -1;
    }
}
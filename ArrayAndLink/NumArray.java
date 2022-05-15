package ArrayAndLink;

// 前缀和
public class NumArray {
    int[] num;
    int re;
    public NumArray(int[] nums){
        num = new int[nums.length+1];
        for (int i = 1; i <= nums.length; i++)
            num[i] = num[i-1] + nums[i-1];

    }

    public int sumRange(int left, int right){
        return num[right+1] - num[left];
    }
}

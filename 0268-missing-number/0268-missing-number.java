class Solution {
    public int missingNumber(int[] nums) {
        int m = nums.length;
        int expectedSum = m * (m + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
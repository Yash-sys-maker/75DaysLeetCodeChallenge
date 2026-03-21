class Solution {
    public void moveZeroes(int[] nums) {
        int Pos = 0;
        
        for (int num : nums) {
            if (num != 0) {
                nums[Pos] = num;
                Pos++;
            }
        }
        
        while (Pos < nums.length) {
            nums[Pos] = 0;
            Pos++;
        }
    }
}

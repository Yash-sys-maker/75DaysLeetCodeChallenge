import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for ( int y = 0 ; y < nums.length-1 ; y++){
            if (nums[y] == nums[y+1]){
                return true;
            }
        }
        return false;
        
    }
}
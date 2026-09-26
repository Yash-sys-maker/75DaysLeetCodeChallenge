import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for ( int z = 0 ; z < nums.length-1 ; z++){
            if (nums[z] == nums[z+1]){
                return true ;
            }
        }
        return false;
        
    }
}
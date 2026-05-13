class Solution {
    public int findPeakElement(int[] nums) {
         int strt = 0;
        int end = nums.length-1;
        while (strt < end){
            int mid = strt + (end-strt)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            else {
                strt = mid+1;
            }
        }
        return strt;
        
    }
}
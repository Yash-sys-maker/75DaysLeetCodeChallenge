class Solution {
public:
    int removeDuplicates(vector<int>& nums) {

        if (nums.size() == 0){
            return 0;
        }
        int k = 0 ;
        for (int m = 1 ; m < nums.size() ; m++){
            if (nums[m] != nums[k]){
                k++;
                nums[k] = nums[m];
            }
        }
        return k+1;
        
    }
};
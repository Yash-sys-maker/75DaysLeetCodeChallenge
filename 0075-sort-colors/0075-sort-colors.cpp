class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i = 0 ; 
        int m = 0 ;
        int j = nums.size()-1;
        while(m<=j){
            if (nums[m] == 0){
                int temp = nums[i];
                nums[i] = nums[m];
                nums[m] = temp;
                m++;
                i++;
            }
            else if (nums[m] == 1){
                m++;
            }
            else {
                int fake = nums[m];
                nums[m] = nums[j];
                nums[j] = fake;
                j--;
            }
        }
        
    }
};
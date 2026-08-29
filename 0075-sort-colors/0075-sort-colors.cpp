class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i = 0 ; 
        int k = 0 ;
        int j = nums.size()-1;
        while(k<=j){
            if (nums[k] == 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
                i++;
            }
            else if (nums[k] == 1){
                k++;
            }
            else {
                int fake = nums[k];
                nums[k] = nums[j];
                nums[j] = fake;
                j--;
            }
        }
        
    }
};
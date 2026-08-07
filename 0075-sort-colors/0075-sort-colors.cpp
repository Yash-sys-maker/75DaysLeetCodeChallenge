class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i = 0 , k = 0 , j = nums.size()-1;
        while (k<=j){
            if (nums[k] == 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
                k++;
            }
            else if (nums[k] == 1){
                k++;
            }
            else{
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
       
    }
};
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> num;
        num.resize(nums.size());
        int i = 0;
        int j = nums.size()-1;
        int k = nums.size()-1;
        while (i <= j){
            if (abs(nums[i]) > abs(nums[j])){
                num[k] = nums[i]*nums[i];
                i++;


            }
            else{
                num[k] = nums[j]*nums[j];
                j--;
            }
            k--;

        }
        return num;

    }
};
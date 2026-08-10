class Solution {
public:
    int pivotIndex(vector<int>& nums) {
         int total = 0;
        for (int i = 0 ; i < nums.size() ; i++){
            total = total +nums[i];
        }
        int leftsum = 0;
        for (int i = 0 ; i < nums.size() ; i++){
            int rightsum = total - leftsum - nums[i];
            if (leftsum == rightsum){
                return i;
            }
            leftsum=leftsum+nums[i];
        }
        return -1;
    }
};
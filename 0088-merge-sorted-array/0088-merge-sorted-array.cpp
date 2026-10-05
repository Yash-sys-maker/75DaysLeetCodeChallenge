class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int q = nums1.size()-1;
        for (int i = 0 ; i < n ; i++){
            nums1[q] = nums2[i];
            q--;
        }
        sort(nums1.begin(),nums1.end());
    }
};
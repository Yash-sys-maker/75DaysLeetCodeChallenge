class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int left = 0;
        
        int max = 0;
        for (int i = 0 ; i < prices.size() ; i++){
            if (prices[i] < prices[left]){
                prices[left] = prices[i];
               
            }
            else {
                int profit = prices[i] - prices[left];
                if (profit > max){
                    max = profit;
                }
            }
        }
        return max;
        
    }
};
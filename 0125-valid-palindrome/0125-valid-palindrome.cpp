class Solution {
public:
    bool isPalindrome(string s) {
        int m = 0;
        int j = s.size()-1;
        while (m < j){
            char left = s[m];
            char right = s[j];
            if (!isalnum(left)){
                m++;
                continue;
            }
            if (!isalnum(right)){
                j--;
                continue;
            }
            if (tolower(left) != tolower(right)){
                return false;
            }
            m++;
            j--;
        }
        return true;
        
    }
};
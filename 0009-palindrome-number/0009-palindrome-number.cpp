class Solution {
public:
    bool isPalindrome(int x) {
        long long original = x;
        long long rev = 0;
        while (x > 0 ){
            long long lastdigit = x%10;
             rev = rev*10 + lastdigit;
            x = x/10;

        }
        return original == rev;
    }
};
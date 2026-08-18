class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()){
            return false;
        }
        unordered_map<char,int>m;

        for (char c : s){
            m[c]++;

        }
        for (auto c2 : t){
            if (m.find(c2)==m.end()){
                return false;
            }
            else {
                m[c2]--;
            }
        }
        for(auto ele:m){
            if (ele.second != 0){
                return false;
            }
            
        }return true;
        
    }
};
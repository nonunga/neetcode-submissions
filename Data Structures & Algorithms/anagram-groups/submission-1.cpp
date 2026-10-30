class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> ans_map;
        vector<vector<string>> ans;
        for (const auto& word : strs) {
            vector<int>counter(26, 0);
            for (const auto& c :  word) {
                counter[c - 'a']++;

            }
            string key;
            for (const auto& value : counter) {
                key += to_string(value) + ',';
            }
            
            ans_map[key].push_back(word);
           
            
            
        }
        for (const auto& v : ans_map) {
            ans.push_back(v.second);
        }
        

        return ans;
        
    }
};

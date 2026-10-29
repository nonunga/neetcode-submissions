class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        data = {}
        
        if len(s) != len(t):
            return False

        for char in s:
            if char in data:
                data[char] += 1
            else:
                data[char] = 1
        
        for char in t:
            if char not in data:
                return False
            
            data[char] -= 1

            if data[char] < 0:
                return False
            
            
        print(data)
        return True

         
           
        
        
    
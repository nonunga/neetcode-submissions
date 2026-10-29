class Solution {
    public boolean isAnagram(String s, String t) {
        //if i order and check if they are equal they are anagrams. 

        char[] charArray1 = s.toCharArray(); 
        char[] charArray2 = t.toCharArray(); 
        Arrays.sort(charArray1); 
        Arrays.sort(charArray2); 
        
        String str1 = String.valueOf(charArray1); 
        String str2 = String.valueOf(charArray2); 

        System.out.println(str1.equals(str2));

        if (str1.equals(str2)){
            return true;
        }

        return false;
    }
}

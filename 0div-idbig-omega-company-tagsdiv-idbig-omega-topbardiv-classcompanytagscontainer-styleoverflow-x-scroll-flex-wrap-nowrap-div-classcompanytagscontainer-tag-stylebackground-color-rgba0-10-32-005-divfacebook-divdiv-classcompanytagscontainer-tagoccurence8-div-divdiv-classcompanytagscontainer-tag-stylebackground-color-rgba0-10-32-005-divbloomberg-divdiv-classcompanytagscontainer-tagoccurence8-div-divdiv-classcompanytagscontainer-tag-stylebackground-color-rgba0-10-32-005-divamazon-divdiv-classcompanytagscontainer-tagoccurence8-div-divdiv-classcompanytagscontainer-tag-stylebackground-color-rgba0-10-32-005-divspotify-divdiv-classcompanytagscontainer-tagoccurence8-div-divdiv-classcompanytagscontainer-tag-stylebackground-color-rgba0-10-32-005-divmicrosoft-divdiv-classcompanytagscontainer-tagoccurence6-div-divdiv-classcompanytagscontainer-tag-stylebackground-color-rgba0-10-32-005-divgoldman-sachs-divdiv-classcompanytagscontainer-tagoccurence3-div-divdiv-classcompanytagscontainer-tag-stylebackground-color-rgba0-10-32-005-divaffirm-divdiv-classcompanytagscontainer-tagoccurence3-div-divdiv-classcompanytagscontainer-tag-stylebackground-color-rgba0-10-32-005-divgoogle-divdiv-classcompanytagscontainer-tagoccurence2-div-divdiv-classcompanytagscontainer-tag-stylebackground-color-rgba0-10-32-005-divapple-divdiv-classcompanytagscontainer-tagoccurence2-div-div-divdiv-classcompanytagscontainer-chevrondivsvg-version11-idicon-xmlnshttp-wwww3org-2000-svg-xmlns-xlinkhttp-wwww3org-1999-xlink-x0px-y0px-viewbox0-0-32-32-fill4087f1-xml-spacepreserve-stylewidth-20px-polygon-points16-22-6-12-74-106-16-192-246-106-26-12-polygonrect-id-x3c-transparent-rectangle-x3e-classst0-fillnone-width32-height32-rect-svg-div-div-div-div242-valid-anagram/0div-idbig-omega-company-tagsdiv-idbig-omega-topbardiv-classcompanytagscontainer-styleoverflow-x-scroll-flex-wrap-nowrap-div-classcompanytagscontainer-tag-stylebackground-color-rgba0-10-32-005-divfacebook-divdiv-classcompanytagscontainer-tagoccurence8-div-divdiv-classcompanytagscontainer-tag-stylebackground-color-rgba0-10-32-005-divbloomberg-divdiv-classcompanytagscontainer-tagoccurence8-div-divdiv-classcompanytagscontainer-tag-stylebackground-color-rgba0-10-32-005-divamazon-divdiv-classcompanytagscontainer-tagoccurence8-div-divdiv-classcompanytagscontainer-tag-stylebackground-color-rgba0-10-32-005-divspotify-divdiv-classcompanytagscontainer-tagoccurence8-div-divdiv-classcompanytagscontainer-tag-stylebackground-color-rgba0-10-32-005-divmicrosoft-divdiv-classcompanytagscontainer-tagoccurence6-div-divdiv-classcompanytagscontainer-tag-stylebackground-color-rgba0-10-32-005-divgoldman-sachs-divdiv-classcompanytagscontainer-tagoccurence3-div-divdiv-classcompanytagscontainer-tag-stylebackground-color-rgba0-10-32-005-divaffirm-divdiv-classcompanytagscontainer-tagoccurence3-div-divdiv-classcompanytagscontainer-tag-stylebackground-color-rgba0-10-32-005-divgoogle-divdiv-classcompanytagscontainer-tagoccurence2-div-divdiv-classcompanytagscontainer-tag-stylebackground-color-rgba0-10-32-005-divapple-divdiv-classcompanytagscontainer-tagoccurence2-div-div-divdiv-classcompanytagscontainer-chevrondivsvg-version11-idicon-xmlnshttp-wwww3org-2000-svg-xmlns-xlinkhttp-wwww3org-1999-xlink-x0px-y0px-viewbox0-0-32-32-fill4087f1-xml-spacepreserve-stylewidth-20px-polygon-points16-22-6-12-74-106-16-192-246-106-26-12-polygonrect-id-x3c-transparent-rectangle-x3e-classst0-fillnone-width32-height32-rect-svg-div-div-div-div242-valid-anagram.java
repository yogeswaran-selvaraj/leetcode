class Solution {
    public boolean isAnagram(String s, String t) {
        char sArray[] = new char[26];
        char tArray[] = new char[26];
        for(char ch : s.toCharArray()){
            sArray[ch - 'a']++;
        }
        
        for(char ch : t.toCharArray()){
            tArray[ch - 'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(tArray[i] != sArray[i]){
                return false;
            }
        }
        
        return true;
            
    }
}
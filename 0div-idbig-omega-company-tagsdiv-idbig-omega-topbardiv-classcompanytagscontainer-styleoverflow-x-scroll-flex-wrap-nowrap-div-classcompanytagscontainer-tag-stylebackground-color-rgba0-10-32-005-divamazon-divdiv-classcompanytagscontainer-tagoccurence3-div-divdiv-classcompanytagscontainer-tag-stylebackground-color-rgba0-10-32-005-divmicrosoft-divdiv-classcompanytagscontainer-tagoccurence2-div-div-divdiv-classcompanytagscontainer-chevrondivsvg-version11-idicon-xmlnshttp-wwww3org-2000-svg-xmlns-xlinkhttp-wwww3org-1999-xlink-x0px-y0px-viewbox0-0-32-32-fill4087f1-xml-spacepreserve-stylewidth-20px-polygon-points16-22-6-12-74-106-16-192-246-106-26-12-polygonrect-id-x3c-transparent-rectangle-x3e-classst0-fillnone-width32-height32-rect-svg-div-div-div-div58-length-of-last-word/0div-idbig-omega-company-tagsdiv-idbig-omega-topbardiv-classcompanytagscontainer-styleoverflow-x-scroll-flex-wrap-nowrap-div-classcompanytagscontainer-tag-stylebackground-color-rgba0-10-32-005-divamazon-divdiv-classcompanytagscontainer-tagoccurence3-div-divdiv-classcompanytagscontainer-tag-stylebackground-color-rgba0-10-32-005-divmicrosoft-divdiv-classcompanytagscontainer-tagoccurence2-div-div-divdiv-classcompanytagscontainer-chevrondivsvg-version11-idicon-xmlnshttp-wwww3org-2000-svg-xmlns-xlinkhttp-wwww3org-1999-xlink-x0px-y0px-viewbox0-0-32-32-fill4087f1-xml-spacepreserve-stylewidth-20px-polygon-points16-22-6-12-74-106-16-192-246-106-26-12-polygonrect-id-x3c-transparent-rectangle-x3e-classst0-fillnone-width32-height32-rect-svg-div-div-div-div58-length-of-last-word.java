class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        for(int i=len-1; i>=0;i--){
            if(s.charAt(i) != ' '){
                int end = i;
                while(i >= 0 && s.charAt(i) != ' ' ){
                    i--;
                }
                
                int start = i;
                return end-start;
            }
        }
        
        return len;
    }
}
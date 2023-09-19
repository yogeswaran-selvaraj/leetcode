class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
                str.append(ch);
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch + 32);
                str.append(ch);
            }
        }
        
        s = str.toString();
        int start = 0;
        int end = s.length()-1;
        // System.out.println(s);
        while(start < end){
            char st = s.charAt(start);
            char ed = s.charAt(end);
            if(st != ed){
                return false;
            }
            
            start++;
            end--;
        }
        
        
        return true;
    }
}
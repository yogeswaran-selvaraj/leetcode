class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int ind=s.length() - 1;
        while(ind >= 0){
            StringBuilder current = new StringBuilder();
            if(s.charAt(ind) != ' '){
                if(ans.length() > 0){
                    ans.append(' ');
                }
                
                while(ind >=0 && s.charAt(ind) != ' '){
                    current.append(s.charAt(ind));
                    ind--;
                }
                
                ans.append(current.reverse().toString());
            }else{
                ind--;
            }
        }
        
        return ans.toString();
    }
}
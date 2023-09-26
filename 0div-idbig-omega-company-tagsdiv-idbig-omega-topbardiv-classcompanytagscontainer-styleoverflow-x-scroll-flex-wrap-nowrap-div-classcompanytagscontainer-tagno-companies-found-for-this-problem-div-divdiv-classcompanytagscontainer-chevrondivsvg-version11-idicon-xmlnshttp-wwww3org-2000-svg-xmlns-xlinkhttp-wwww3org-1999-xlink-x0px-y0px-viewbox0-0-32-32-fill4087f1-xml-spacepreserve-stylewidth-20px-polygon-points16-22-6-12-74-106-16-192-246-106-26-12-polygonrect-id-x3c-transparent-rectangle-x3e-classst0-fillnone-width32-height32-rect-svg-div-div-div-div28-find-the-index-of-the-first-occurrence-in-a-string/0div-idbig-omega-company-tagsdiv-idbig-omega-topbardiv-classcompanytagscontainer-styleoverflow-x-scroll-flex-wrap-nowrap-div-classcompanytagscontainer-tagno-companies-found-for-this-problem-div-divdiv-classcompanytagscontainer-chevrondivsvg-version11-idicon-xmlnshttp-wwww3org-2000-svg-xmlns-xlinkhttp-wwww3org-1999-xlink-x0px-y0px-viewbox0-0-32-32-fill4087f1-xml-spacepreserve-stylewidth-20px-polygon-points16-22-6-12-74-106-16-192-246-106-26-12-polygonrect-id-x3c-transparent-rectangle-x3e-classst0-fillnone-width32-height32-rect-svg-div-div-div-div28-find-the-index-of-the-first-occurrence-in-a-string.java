class Solution {
    public int strStr(String haystack, String needle) {
        int ans = -1;
        int p1 = 0;
        int p2 = 0;
        int l1 = haystack.length();
        int l2 = needle.length();
        for(int i=0;i<= l1 - l2; i++){
            String str = haystack.substring(i, i+l2);
            // System.out.println(str);
            if(str.equals(needle)){
                return i;
            }
        }
        
        return -1;
    }
}
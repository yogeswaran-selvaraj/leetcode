class Solution {
    public int characterReplacement(String s, int k) {
        int maxf = 0;
        int len = s.length();
        int j = 0;
        int ans = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            int count = freq.getOrDefault(ch, 0);
            count += 1;
            maxf = Math.max(count, maxf);
            freq.put(ch, count);
            while((i- j + 1 - maxf) > k){
                ch = s.charAt(j);
                count = freq.getOrDefault(ch, 0);
                count -= 1;
                freq.put(ch, count);
                j++;
            }
            
            // System.out.println(i + " " + j);
            ans = Math.max(i-j+1, ans);
        }
        
        return ans;
    }
}
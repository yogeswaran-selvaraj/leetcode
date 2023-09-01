class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size();
        int i =0;
        int maxf = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int j=0;j<n;j++){
            int cnt = freq.getOrDefault(nums.get(j), 0) + 1;
            freq.put(nums.get(j), cnt);
            maxf = Math.max(maxf, cnt);
            if((j-i+1) - maxf > k){
                cnt = freq.getOrDefault(nums.get(i), 0) - 1;
                freq.put(nums.get(i), cnt);
                i++;
            }
        }

        return maxf;
    }
}
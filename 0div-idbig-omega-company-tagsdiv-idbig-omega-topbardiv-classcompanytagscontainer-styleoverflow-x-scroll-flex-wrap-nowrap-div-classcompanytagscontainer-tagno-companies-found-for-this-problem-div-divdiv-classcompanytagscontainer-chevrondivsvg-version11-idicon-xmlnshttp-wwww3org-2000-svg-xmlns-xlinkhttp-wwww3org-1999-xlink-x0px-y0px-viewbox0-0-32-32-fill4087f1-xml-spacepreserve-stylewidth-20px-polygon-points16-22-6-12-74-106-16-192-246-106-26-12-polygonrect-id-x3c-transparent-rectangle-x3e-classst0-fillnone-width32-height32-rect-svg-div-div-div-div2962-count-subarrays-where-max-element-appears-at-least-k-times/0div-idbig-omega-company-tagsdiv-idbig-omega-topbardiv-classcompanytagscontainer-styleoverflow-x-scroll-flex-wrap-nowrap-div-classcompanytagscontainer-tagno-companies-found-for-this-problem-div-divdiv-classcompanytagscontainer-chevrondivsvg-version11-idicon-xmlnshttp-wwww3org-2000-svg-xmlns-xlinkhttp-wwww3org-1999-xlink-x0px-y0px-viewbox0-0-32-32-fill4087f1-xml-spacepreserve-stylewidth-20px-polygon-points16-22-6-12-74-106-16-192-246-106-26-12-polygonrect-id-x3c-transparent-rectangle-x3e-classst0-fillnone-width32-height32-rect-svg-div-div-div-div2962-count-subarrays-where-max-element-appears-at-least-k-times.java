class Solution {
    public long countSubarrays(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        int max = 0;
        long ans = 0l;
        for(int i=0; i<len; i++){
            max = Math.max(max, nums[i]);
        }
        
        int j = 0;
        for(int i=0; i<len; i++){
            if(nums[i] == max){
                count = count + 1;
            }
            
            if(count >= k){
                while(count >= k){
                    ans += len - i;
                    // System.out.println(ans);
                    if(nums[j] == max){
                        count = count - 1;
                    }
                    
                    j++;
                }
            }
        }
                
        return ans;
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int forward = 1;
        int backward = 1;
        int len = nums.length;
        int answer[] = new int[len];
        for(int ind = 0; ind < len ; ind++){
            answer[ind] = forward * nums[ind];
            forward = answer[ind];
        }
        
        for(int ind = len - 1; ind >= 0; ind--){
            if(ind == 0){
                answer[ind] = backward;
                continue;
            }
            
            answer[ind] = backward * answer[ind - 1];
            backward = nums[ind] * backward;
        }
        
        return answer;
    }
}
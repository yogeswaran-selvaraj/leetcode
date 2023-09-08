class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<nums.length;i++){
            if(!stack.empty() && stack.peek() == nums[i]){
                stack.pop();
                stack.push(nums[i]);
            }else{
                stack.push(nums[i]);
            }
        }
        
        int len = stack.size();
        for(int i=len - 1; i >= 0;i--){
            nums[i] = stack.pop();
        }
        
        
        return len;
    }
}
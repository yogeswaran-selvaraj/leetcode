class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=0;i+1<len; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        
        return false;
    }
}
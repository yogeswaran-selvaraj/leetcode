class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = nums.length - 1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        
        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment) && map.get(compliment) != i){
                left = map.get(compliment);
                right =  i;
                break;
            }
        }
        
        return new int[]{left, right};
    }
}
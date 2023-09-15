class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hm.add(nums[i]);
        }
        
        for(int i=0;i<nums.length;i++){
            if(!hm.contains(i+1)){
                ans.add(i+1);
            }
        }
        
        return ans;
    }
}
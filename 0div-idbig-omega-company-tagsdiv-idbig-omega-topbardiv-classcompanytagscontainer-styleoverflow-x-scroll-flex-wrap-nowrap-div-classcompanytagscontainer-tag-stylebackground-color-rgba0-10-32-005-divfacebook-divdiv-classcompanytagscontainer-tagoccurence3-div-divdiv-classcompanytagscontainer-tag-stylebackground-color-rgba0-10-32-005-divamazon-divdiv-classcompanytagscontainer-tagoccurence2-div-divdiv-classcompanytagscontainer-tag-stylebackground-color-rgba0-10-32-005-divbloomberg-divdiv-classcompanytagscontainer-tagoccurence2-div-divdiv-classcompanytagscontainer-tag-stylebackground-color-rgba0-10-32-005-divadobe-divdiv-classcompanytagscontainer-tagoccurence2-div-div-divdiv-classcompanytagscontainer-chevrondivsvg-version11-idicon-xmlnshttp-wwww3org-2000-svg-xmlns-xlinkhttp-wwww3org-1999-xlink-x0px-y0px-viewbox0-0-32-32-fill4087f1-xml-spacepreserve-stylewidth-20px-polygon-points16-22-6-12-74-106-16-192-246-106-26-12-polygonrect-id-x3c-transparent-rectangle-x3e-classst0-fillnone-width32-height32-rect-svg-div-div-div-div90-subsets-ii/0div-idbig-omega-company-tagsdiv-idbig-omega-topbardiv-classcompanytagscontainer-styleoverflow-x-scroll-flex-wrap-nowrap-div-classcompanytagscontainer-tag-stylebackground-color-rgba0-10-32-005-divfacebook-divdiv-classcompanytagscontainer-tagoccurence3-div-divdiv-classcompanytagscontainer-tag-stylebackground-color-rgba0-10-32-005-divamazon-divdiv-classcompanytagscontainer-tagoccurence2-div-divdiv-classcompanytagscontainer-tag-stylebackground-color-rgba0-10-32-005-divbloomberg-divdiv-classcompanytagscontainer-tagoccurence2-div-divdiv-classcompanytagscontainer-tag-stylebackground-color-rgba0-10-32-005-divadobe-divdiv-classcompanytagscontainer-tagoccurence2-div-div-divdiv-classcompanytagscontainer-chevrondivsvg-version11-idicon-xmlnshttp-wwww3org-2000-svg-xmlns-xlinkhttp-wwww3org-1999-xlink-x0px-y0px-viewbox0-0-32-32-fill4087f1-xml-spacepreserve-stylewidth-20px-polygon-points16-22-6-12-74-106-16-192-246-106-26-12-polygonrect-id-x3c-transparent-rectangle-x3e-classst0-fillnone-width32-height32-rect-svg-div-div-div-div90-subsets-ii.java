class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        ans = generateSubsets(new ArrayList<Integer>(), 0, nums, ans);
        return ans;
    }
    
    ArrayList<List<Integer>> generateSubsets(ArrayList<Integer> cur, int index,int[] nums, ArrayList<List<Integer>> ans){
        ans.add(new ArrayList<>(cur));
        for(int i=index; i< nums.length;i++){
            if(i > index && nums[i] == nums[i-1]){
              continue;  
            }
            
            cur.add( nums[i] );
            ans = generateSubsets(cur, i + 1, nums, ans);
            cur.remove( cur.size() - 1 );
        }
        
        return ans;
    }
}
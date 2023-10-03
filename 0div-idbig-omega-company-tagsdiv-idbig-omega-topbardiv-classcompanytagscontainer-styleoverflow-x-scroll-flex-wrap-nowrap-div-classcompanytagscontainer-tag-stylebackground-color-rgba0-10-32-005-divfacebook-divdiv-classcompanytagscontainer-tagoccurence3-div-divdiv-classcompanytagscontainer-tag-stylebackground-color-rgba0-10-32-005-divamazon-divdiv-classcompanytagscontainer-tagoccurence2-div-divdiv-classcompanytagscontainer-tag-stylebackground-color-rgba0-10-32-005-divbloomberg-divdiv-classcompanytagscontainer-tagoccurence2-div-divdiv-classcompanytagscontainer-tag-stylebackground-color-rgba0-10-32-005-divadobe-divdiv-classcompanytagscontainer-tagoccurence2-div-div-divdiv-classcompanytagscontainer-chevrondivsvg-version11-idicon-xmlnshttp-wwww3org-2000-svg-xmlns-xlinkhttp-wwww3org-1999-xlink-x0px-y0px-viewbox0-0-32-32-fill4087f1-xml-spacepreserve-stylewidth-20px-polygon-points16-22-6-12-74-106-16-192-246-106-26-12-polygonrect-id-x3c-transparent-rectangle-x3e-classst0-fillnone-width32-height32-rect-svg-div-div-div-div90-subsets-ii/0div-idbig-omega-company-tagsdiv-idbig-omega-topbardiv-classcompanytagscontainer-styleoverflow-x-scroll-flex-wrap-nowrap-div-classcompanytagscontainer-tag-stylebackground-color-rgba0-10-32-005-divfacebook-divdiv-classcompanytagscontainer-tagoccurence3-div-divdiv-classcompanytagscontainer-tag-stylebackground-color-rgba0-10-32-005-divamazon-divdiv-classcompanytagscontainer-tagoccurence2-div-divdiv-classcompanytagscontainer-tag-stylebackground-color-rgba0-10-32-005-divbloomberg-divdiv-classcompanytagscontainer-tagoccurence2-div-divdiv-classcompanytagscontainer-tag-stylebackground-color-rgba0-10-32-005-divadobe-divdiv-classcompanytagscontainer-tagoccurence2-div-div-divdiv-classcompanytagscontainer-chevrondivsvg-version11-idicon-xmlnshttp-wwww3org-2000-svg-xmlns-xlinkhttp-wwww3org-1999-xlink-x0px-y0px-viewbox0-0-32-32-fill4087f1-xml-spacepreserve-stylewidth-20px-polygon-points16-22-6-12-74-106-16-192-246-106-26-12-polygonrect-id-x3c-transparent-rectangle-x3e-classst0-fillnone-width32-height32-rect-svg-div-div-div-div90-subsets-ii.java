class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        generateSubsets(new ArrayList<Integer>(), 0, nums);
        return ans;
    }
    
    void generateSubsets(ArrayList<Integer> cur, int index,int[] nums){
        ans.add(new ArrayList<>(cur));
        for(int i=index; i< nums.length;i++){
            // System.out.println(i + " " + index + " " + cur);
            if(i > index && nums[i] == nums[i-1]){
              continue;  
            }
            
            cur.add( nums[i] );
            generateSubsets(cur, i + 1, nums);
            cur.remove( cur.size() - 1 );
        }
    }
}
class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        boolean visited[] = new boolean[len];
        generatePermutations(nums, 0, new ArrayList<Integer>(), visited);
        return ans;
    }
    
    void generatePermutations(int[] nums, int index, ArrayList<Integer> cur, boolean visited[]){
        if(index == nums.length){
            ans.add( new ArrayList<>(cur));
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            if(visited[i] == false){
                visited[i] = true;
                cur.add( nums[i] );
                generatePermutations(nums, index + 1, cur, visited);
                visited[i] = false;
                cur.remove( cur.size() - 1);
            }
        }
    }
}
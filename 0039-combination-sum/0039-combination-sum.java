class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        getCombination(new ArrayList<Integer>(), 0, candidates, target, 0);
        return ans; 
    }
    
    void getCombination(ArrayList<Integer> cur,int start, int[] candidates,  int target, int curSum){
        
        if(curSum == target){
            ans.add(new ArrayList(cur));
            return;
        }
        
        if(curSum > target || start >= candidates.length ){
            return;
        }
        
        cur.add( candidates[start] );
        getCombination(cur, start, candidates, target, curSum + candidates[start]);
        cur.remove(cur.size() - 1);
        getCombination(cur, start+1, candidates, target, curSum);
    }
}
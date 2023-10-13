class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        
        getCombination(new ArrayList<Integer>(), 1, n, k);
        return ans;
    }
    
    void getCombination(ArrayList<Integer> cur,int start, int end,  int k){
        if(cur.size() == k){
            ans.add(new ArrayList(cur));
            return;
        }
        
        for(int i=start; i<=end; i++){
            cur.add(i);
            getCombination(cur, i+1, end, k);
            cur.remove(cur.size() - 1);
        }
    }
}
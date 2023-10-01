class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxa = 0l;
        long maxab = 0l;
        long res = 0l;
        for(int a : nums){
            res = Math.max(res, maxab * a);
            maxab = Math.max(maxab, maxa - a);
            maxa = Math.max(a, maxa);
        }
        
        return res;
    }
}
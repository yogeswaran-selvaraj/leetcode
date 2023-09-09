class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        
        // System.out.println(map);
        int ind = 0;
        for(Map.Entry<Integer, Integer> ele : map.entrySet()){
            for(int i=0; i<ele.getValue() && i < 2; i++){
                nums[ind] = ele.getKey();
                ind++;
            }
        }
        
        return ind;
    }
}
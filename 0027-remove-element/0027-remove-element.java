class Solution {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        int j = nums.length - 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                ans++;
            }
        }
        
        if(ans == 0){
            return ans;
        }
        
        // for(int i=0; i<j;i++){   
        // }
        
        for(int i=0; i<j;i++){     
            if(i == j){
                break;
            }
            
            
            while(nums[i] == val && i<j){
                int temp = nums[i];
                // System.out.println(temp + " " + j);
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        
        
        return ans;
    }
}
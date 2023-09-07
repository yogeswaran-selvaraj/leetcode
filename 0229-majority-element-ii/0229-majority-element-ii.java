class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int num1 = 0, num2 = 0, cnt1 = 0, cnt2 = 0;
        for(int a : nums){
            if(cnt1 == 0 && num2 != a){
                num1 = a;
            }
            else if(cnt2 == 0 && num1 != a){
                num2 = a;
            }
            
            if(num1 == a){
                cnt1++;
            }
            else if(num2 == a){
                cnt2++;
            }
            
            if(num1 != num2 && num1 != a && num2 != a){
                cnt1--;
                cnt2--;
            }
            
        }
        
        cnt1 = 0;
        cnt2 = 0;
        for(int a : nums){
            if(a == num1){
                cnt1++;
            }
            else if(a == num2){
                cnt2++;
            }
        }
        
        int len = nums.length;
        if(cnt1 > len/3){
            ans.add(num1);
        }
        
        if(cnt2 > len/3){
            ans.add(num2);
        }
        
        return ans;
        
    }
}
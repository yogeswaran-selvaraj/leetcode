import java.util.*;
import java.lang.*;
class Solution {
    public double minimumAverage(int[] nums) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int len = nums.length;
        double ans = Double.MAX_VALUE;
        for(int i=0;i<len; i++){
            min.add(nums[i]);
            max.add(nums[i]);
        }
        
        for(int i=0;i<len/2; i++){
            // System.out.println(min);
            // System.out.println(max);
            int num1 = min.poll();
            int num2 = max.poll();
            ans = Math.min(ans, (num1+num2) / 2.0);
            // System.out.println(num1 + " " + num2 + " " + ans);
        }
        
       
        return ans;
        
    }
}
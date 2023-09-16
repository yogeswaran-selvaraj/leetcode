class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int low = 0;
        int len = citations.length;
        int high = len - 1;
        int mid = 0;
        // if(citations[len - 1] == 0){
        //     return 0;
        // }
        
        while(low <= high){
            mid = low + ((high-low)/2);
            if(citations[mid] == (len - mid)){
                return citations[mid]; 
            }
            else if(citations[mid] > (len - mid)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        
        return len - low;
    }
}
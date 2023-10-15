class Solution {
    public int[] findIndices(int[] A, int d, int v) {
        int min = 0;
        int max = 0;
        int n = A.length;
        for(int i=d;i<n;i++){
            if(A[i-d] < A[min]) min = i-d;
            if(A[i-d] > A[max]) max = i-d;
            if(A[max] - A[i] >= v) return new int[]{max, i};
            if(A[i] - A[min] >= v) return new int[]{min, i};
        }
        
        return new int[]{-1,-1};
    }
}
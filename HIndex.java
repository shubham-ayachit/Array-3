class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] nums = new int[n+1];
        for(int i = 0; i<n; i++) {
            if(citations[i]>n) {
                nums[n]++;
            } else {
                nums[citations[i]]++;
            }
        }
        int rsum = 0;

        for(int i = n; i>0; i--){
            rsum = rsum+nums[i];
            if(rsum>=i){
                return i;
            }
        }
        return 0;
    }
}

//T.c = O(n)
//S.C = O(n)

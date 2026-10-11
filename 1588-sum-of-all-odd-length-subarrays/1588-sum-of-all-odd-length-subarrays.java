class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            int cnt=0,sum=0;
            for(int j=i;j<n;j++){
                cnt++;
                sum+=arr[j];
                if(cnt%2!=0) res+=sum;
            }
        }
        return res;
    }
}
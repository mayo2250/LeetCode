class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int min=1000000000;
        for(int i=0;i<n;i++) if(nums[i]<min) min=nums[i];
        int max=0;
        int c1=1;
        int result = -1;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
            if(c1==1){
                for(int j=i;j<n;j++){
                    if(nums[j]<min) min=nums[j];
                }
            }
            int st = max - min;
            if(st<=k){
                result = i;
                break;
            }
            if(nums[i]==min){
                c1=1;
                min=1000000000;
            }
            else c1=0;
        }
        return result;
    }
}
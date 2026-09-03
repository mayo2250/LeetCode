class Solution {
    public boolean uniformArray(int[] nums) {
        int n = nums.length;
        int even = 0;
        int odd = 0;
        int min =nums[0];
        for(int i =0; i<n; i++){
            if(nums[i]%2!=0){
                odd++;
            }else even++;
            min = Math.min(min, nums[i]);
        }
        if(even == n || odd == n)return true;

        return min%2!=0;
    }
}